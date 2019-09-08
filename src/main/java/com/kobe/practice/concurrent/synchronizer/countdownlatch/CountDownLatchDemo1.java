package com.kobe.practice.concurrent.synchronizer.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: CountDownLatchDemo1
 * @Description: 使用new Thread的方式测试CountDownLatch
 * @Author: Tao
 * @Date 2019-09-02 08:59
 */
public class CountDownLatchDemo1 {

    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("child t1 thread end...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("child t2 thread end...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });

        t1.start();
        t2.start();

        System.out.println("waiting all child threads end...");

        countDownLatch.await();

        System.out.println("all child threads end...");

    }

}
