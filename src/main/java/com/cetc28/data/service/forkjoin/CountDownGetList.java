package com.cetc28.data.service.forkjoin;

import com.cetc28.data.dao.ICountDown;

import java.util.List;
import java.util.concurrent.*;

public class CountDownGetList {

    private ICountDown iCountDown;

    public <T> List<T> getList() {
        int count = iCountDown.count();

        int threadCount = 2 * Runtime.getRuntime().availableProcessors() + 1;
        ThreadPoolExecutor pool = new ThreadPoolExecutor(threadCount, threadCount, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new MyFactory());
        CountDownLatch countDownLatch = new CountDownLatch(2);
        int start = 0;
        int end = 0;
        for (int i = 0; i < count; ) {
            start = i;
            i = i + 5000;
            end = i;

            pool.execute(new Consult2(countDownLatch, iCountDown, start, end, , ));
        }


    }

    class MyFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            return null;
        }
    }

    class Consult2 implements Runnable {

        private CountDownLatch consultLatch;
        private ICountDown countDown;
        private Integer startRowNum;
        private Integer endRowNum;
        private List[] res;
        private int i;

        public Consult2(CountDownLatch consultLatch, ICountDown countDown, Integer startRowNum, Integer endRowNum, List[] res, int i) {
            this.consultLatch = consultLatch;
            this.countDown = countDown;
            this.startRowNum = startRowNum;
            this.endRowNum = endRowNum;
            this.res = res;
            this.i = i;
        }

        @Override
        public void run() {
            long bf = System.currentTimeMillis();
            res[i] = countDown.getIds(startRowNum, endRowNum);
            System.out.println("start :" + startRowNum + " end :" + endRowNum + " \r\n thread costs :" + (System.currentTimeMillis() - bf) + "countDown:" + consultLatch.getCount());
            consultLatch.countDown();
        }
    }

}

