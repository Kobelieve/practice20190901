package com.kobe.practice.threadlocal;

/**
 * @ClassName: ThreadLocalTest
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-05-15 21:04
 */
public class ThreadLocalTest {

    public static ThreadLocal<String> USER_NAME = new ThreadLocal<>();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            USER_NAME.set("t1 username...");
            print("t1");
            System.out.println("t1 removed..." + USER_NAME.get());
        });

        Thread t2 = new Thread(() -> {
            USER_NAME.set("t2 username...");
            print("t2");
            System.out.println("t2 removed..." + USER_NAME.get());
        });

        t1.start();
        t2.start();

    }

    public static void print(String str) {
        System.out.println(str + "：" + USER_NAME.get());
        USER_NAME.remove();
    }

}
