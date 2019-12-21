package com.kobe.practice.interview;

import java.util.concurrent.locks.LockSupport;

/**
 * @ClassName: LockSupportDemo
 * @Description: 使用两个线程，交替打印1a2b3c4d5e
 * @Author: Tao
 * @Date 2019-12-21 08:40
 */
public class LockSupportDemo {

    static Thread t1 = null, t2 = null;

    public static void main(String[] args) {

        char[] letterCharArray = "abcde".toCharArray();
        char[] numberCharArray = "12345".toCharArray();

        t1 = new Thread(() -> {
            for (char c : numberCharArray) {
                System.out.println(Thread.currentThread().getName() + ":" + c);
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        }, "t1");

        t2 = new Thread(() -> {
            for (char c : letterCharArray) {
                LockSupport.park();
                System.out.println(Thread.currentThread().getName() + ":" + c);
                LockSupport.unpark(t1);
            }
        }, "t2");

        t1.start();
        t2.start();

    }

}
