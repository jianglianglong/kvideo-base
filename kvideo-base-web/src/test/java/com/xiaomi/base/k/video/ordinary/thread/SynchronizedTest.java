package com.xiaomi.base.k.video.ordinary.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lianglong jiang
 * @date 2021/6/9 6:55 下午
 */
public class SynchronizedTest {

    public int i = 1;

    public synchronized int updateValue() {
        i = 3;
        System.out.println(i);
        return i;
    }

    public int getValue() {
        return i;
    }

    public synchronized void setValue() throws InterruptedException {
        System.out.println(i);
        i = 2;
        Thread.sleep(10000);
    }

    @Test
    public void testSetValue() throws InterruptedException {
        setValue();
        System.err.println("end");

        System.out.println(getValue());
        Thread.sleep(10000);

    }

    @Test
    public void testGetValue() {
        int j  =0;

        while (true) {
            System.out.println(getValue());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            j++;
            if (j == 20) {
                break;
            }
        }
    }

    @Test
    public void testTotal() throws InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 1000, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        poolExecutor.submit(this::updateValue);

        poolExecutor.submit(() -> {
            try {
                setValue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(getValue());


        Thread.sleep(5000);
        System.out.println(getValue());

    }
}
