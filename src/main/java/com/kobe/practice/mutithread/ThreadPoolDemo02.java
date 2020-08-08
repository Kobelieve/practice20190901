package com.kobe.practice.mutithread;

import com.google.errorprone.annotations.Var;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @ClassName: ThreadPoolDemo01
 * @Description: ThreadPoolDemo01
 * @Author: Tao
 * @Date 2020-08-02 20:55
 */
public class ThreadPoolDemo02 {


    public static void main(String[] args) throws Exception {

        Instant start = Instant.now();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<?> future1 = executorService.submit(new Task1());
        Future<?> future2 = executorService.submit(new Task2());
        Future<?> future3 = executorService.submit(new Task3());

        executorService.shutdown();

        while (true) {

            if (executorService.isTerminated()) {
                Instant end = Instant.now();
                System.out.println("use thread pool: [" + Duration.between(start, end).toMillis() + "] ms");
                break;
            }
        }

    }


    static class Task1 implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("task1 start...");
                Thread.sleep(3000);
                System.out.println("task1 end...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Task2 implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("task2 start...");
                Thread.sleep(2000);
                System.out.println("task2 end...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Task3 implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("task3 start...");
                Thread.sleep(1000);
                System.out.println("task3 end...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
