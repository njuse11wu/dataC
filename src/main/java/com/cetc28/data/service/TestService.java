package com.cetc28.data.service;

import com.cetc28.data.dao.ICountDown;
import com.cetc28.data.dao.PersonBasicRepository;
import com.cetc28.data.dao.PersonDutyRepository;
import com.cetc28.data.pojo.TPersonBasicInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.*;

@Service
public class TestService {

    @Resource
    private PersonBasicRepository personBasicRepository;
    @Resource
    private PersonDutyRepository personDutyRepository;

    public void getPersonTest() {
        long before = System.currentTimeMillis();
        List<TPersonBasicInfo> personBasicInfoList = personBasicRepository.findAllTest();
        System.out.println("it costs" + (System.currentTimeMillis() - before));


        int counts = 165984;
//                (int) personBasicRepository.count();

//        ForkJoinPool fp = new ForkJoinPool();
//        List<String> ids = fp.invoke(new forkGetIds(0, counts));
//
//





        int threadCount = 2*Runtime.getRuntime().availableProcessors() + 1;
        int skipCount = 10000;
//        int skipCount = counts / threadCount;
        CountDownLatch latch = new CountDownLatch(threadCount);
        try {
//            ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
//            pool.submit();
//            List infos = new Consult(latch,personBasicRepository ,0 ,1000 ).call();
            List[] lists = new List[threadCount];
            for (int i = 0; i < threadCount; i++) {
                Thread t = new Thread(new Consult2(latch, personBasicRepository, i * skipCount, (i + 1) * skipCount, lists, i));
                t.start();
//                List list = new Consult(latch, personBasicRepository, i * skipCount, (i + 1) * skipCount).call();
//                lists.add(i, list);
            }
            latch.await();
            System.out.println("!!");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

//    class CallableFactory {
//        Callable createCallable() {
//
//            return null;
//        }
//
//    }

    class forkGetIds extends RecursiveTask<List<String>> {
        private int start;
        private int end;

        forkGetIds(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected List<String> compute() {
            if (end - start > 5000) {
                int mid = (end + start) / 2;
                forkGetIds f1 = new forkGetIds(start, mid);
                forkGetIds f2 = new forkGetIds(mid+1 , end);
                ForkJoinTask.invokeAll(f1, f2);
                List<String> res = new Vector<>(f1.join());
                res.addAll(f2.join());
                return res;
            } else {
                System.out.println("start :" + start + " end :" + end );
                List<String> res = personBasicRepository.getIds(start, end);
                System.out.println(res.size());
                return res;
            }
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


    class Consult implements Callable {

        private CountDownLatch consultLatch;
        private ICountDown countDown;
        private Integer startRowNum;
        private Integer endRowNum;

        public Consult(CountDownLatch consultLatch, ICountDown countDown, Integer startRowNum, Integer endRowNum) {
            this.consultLatch = consultLatch;
            this.countDown = countDown;
            this.startRowNum = startRowNum;
            this.endRowNum = endRowNum;
        }

        @Override
        public List call() {
            long bf = System.currentTimeMillis();
            List res = countDown.getIds(startRowNum, endRowNum);
            System.out.println("start :" + startRowNum + " end :" + endRowNum + " \r\n thread costs :" + (System.currentTimeMillis() - bf) + "countDown:" + consultLatch.getCount());
            consultLatch.countDown();
            return res;
        }
    }
}
