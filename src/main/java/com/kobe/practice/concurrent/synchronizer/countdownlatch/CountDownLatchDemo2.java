package com.kobe.practice.concurrent.synchronizer.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: CountDownLatchDemo2
 * @Description: 使用线程池的方式测试CountDownLatch
 * @Author: Tao
 * @Date 2019-09-02 09:09
 */
public class CountDownLatchDemo2 {

    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("child t1 thread end...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });


        executorService.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("child t2 thread end...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });

        System.out.println("waiting all child threads end...");

        countDownLatch.await();

        System.out.println("all child threads end...");
        executorService.shutdown();

    }


}
