package com.kobe.practice.mutithread;

import java.time.Duration;
import java.time.Instant;

/**
 * @ClassName: ThreadPoolDemo01
 * @Description: ThreadPoolDemo01
 * @Author: Tao
 * @Date 2020-08-02 20:55
 */
public class ThreadPoolDemo01 {


    public static void main(String[] args) throws Exception {

        Instant start = Instant.now();
        new Task1().run();
        new Task2().run();
        new Task3().run();
        Instant end = Instant.now();
        System.out.println("duration without thread pool: [" + Duration.between(start, end).toMillis() + "] ms");

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
