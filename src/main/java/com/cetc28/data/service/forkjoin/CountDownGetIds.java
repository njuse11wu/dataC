package com.cetc28.data.service.forkjoin;

import com.cetc28.data.dao.ICountDown;
import com.cetc28.data.util.PoolSizeUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wq
 */
@Slf4j
public class CountDownGetIds {

    /**
     *
     * @param iCountDown 具体实现类
     * @param countSize 每次查询的数量
     * @return idList
     */
    public static List<String> getList(ICountDown iCountDown, int countSize) {
        int count = iCountDown.getIdCount();
        int threadCount = PoolSizeUtil.getPoolSize(0.9);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(threadCount, threadCount, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), new MyFactory());
        int start;
        int end;
        Vector<String> vector = new Vector<>();
        int latchCount = count / countSize + 1;
        CountDownLatch countDownLatch = new CountDownLatch(latchCount);

        for (int i = 0; i < latchCount; i++) {
            start = i * countSize;
            end = (i + 1) * countSize;
            pool.execute(new ConsultWrapper(countDownLatch, iCountDown, start, end, vector));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            log.error("error happens while awaiting latch",e );
        }
        return vector;
    }

    static class MyFactory implements ThreadFactory {
        private final String namePrefix;
        private final ThreadGroup group;
        private final AtomicInteger threadNumber = new AtomicInteger(1);

        private MyFactory() {
            namePrefix = "countIdThread-";
            SecurityManager s = System.getSecurityManager();
            group = (s != null) ? s.getThreadGroup() :
                    Thread.currentThread().getThreadGroup();
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(group, r, namePrefix + threadNumber.getAndIncrement());
            if (t.isDaemon()) {
                t.setDaemon(false);
            }
            return t;
        }
    }

    static class ConsultWrapper implements Runnable {

        private CountDownLatch consultLatch;
        private ICountDown countDown;
        private Integer startRowNum;
        private Integer endRowNum;
        private List<String> res;

        private ConsultWrapper(CountDownLatch consultLatch, ICountDown countDown, Integer startRowNum, Integer endRowNum, List<String> res) {
            this.consultLatch = consultLatch;
            this.countDown = countDown;
            this.startRowNum = startRowNum;
            this.endRowNum = endRowNum;
            this.res = res;
        }

        @Override
        public void run() {
            try {
                long bf = System.currentTimeMillis();
                res.addAll(countDown.getIds(startRowNum, endRowNum));
                System.out.println("start :" + startRowNum + " end :" + endRowNum + " \r\n thread costs :" + (System.currentTimeMillis() - bf) + "countDown:" + consultLatch.getCount());
            } finally {
                consultLatch.countDown();
            }
        }
    }
}
