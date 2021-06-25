package com.xiaomi.base.k.video.ordinary.thread;

import com.xiaomi.base.k.video.global.exception.VideoException;
import org.junit.jupiter.api.Test;

import javax.security.auth.callback.Callback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试多线程的类
 *
 * @author lianglong jiang
 * @date 2021/5/3 3:18 下午
 */
public class TestMain {

    @Test
    public void testFutureTask() throws ExecutionException, InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 8,
                1000, TimeUnit.SECONDS,
                new SynchronousQueue<>());
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(() -> {
                int i1 = atomicInteger.incrementAndGet();
                System.err.println(i1);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }


    }


    @Test
    public void testCountDownLatch() throws InterruptedException {

        //创建的线程数，必须要和这个参数保持一致
        CountDownLatch countDownLatch = new CountDownLatch(5);

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                countDownLatch.countDown();
                System.out.println(Thread.currentThread() + "thread  jieshu");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }).start();
        }
        //数字减到0
        countDownLatch.await();
        System.out.println("end");

    }

    /**
     * 测试Semaphore
     *
     * @throws InterruptedException
     */
    @Test
    public void testSemaphore() throws InterruptedException {
        final int THREAD_COUNT = 30;
        ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
        Semaphore s = new Semaphore(10);
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(() -> {
                try {
                    s.acquire();
                    System.out.println("save data" + System.currentTimeMillis());
                    s.release();
                } catch (InterruptedException e) {
                }
            });
        }
        threadPool.shutdown();
    }

    /**
     * 测试线程之间的通讯
     *
     * @throws InterruptedException
     */
    @Test
    public void testExchange() throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Exchanger<String> exchanger = new Exchanger<>();
        threadPool.execute(() -> {
            try {
                String a = exchanger.exchange("sdafasd");
                System.out.println("save data: " + a + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        threadPool.execute(() -> {
            try {
                String hallo = exchanger.exchange("hallo");
                System.out.println("save data: " + hallo + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void testThread() throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10,
                1000, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100));

        HashMap<String, Future<List<String>>> futureHashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            futureHashMap.put("test_" + i, executor.submit(() -> {
                List<String> resultList = new ArrayList<>();
                resultList.add("1");
                resultList.add("2");
                resultList.add("3");
                resultList.add("4");
                return resultList;
            }));
        }

//        List<String> res = future.get();
//        res.forEach(System.out::println);

    }

    @Test
    public void testCPU() {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }


    @Test
    public void testCom() throws InterruptedException {
        List<String> labelList = new ArrayList<>();
        labelList.add("1");
        labelList.add("2");
        labelList.add("3");
        labelList.add("4");
        labelList.add("5");
        labelList.add("6");


        execute(labelList);

        System.err.println(" =========== complete =======");
        Thread.sleep(10000);

    }

    private void execute(List<String> labelList) throws InterruptedException {
        List<CompletableFuture<Void>> taskFutures = new ArrayList<>();
        labelList.forEach(labelInfo -> taskFutures.add(CompletableFuture.runAsync(() -> {
            if (labelInfo.equals("4")) {
                throw new VideoException("error");
            }
            System.out.println(labelInfo);

        }).whenComplete((aVoid, throwable) -> {
            System.out.println("end" + labelInfo);
        })));

        System.out.println("============= executeLabelJob end: " + taskFutures.size());
        CompletableFuture.allOf(taskFutures.toArray(new CompletableFuture[0])).join();

        System.err.println(" =========== complete =======");

    }

}

