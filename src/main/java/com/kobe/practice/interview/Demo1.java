package com.kobe.practice.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: Demo1
 * @Description: 用3个线程依次交替打印1~100
 * @Author: Tao
 * @Date 2019-09-14 10:40
 */
public class Demo1 {

    public static int i = 1;

    public static void main(String[] args) {
        // 创建锁对象
        Lock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> {
            while (true) {
                lock.lock();
                // 线程1休眠
                condition1.await();
                if (i <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + i++);
                }
                // 唤醒线程2
                condition2.signal();
                lock.unlock();
            }
        });

        executorService.submit(() -> {
            while (true) {
                lock.lock();
                // 线程2休眠
                condition2.await();
                if (i <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + i++);
                }
                // 唤醒线程3
                condition3.signal();
                lock.unlock();
            }
        });

        executorService.submit(() -> {
            while (true) {
                lock.lock();
                // 线程3休眠
                condition3.await();
                if (i <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + i++);
                }
                // 唤醒线程1
                condition1.signal();
                lock.unlock();
            }
        });

        // 专门唤醒线程1
        new Thread(() -> {
            lock.lock();
            condition1.signal();
            lock.unlock();
        }).start();


    }

}
