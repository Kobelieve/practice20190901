package com.kobe.practice.threadlocal;

/**
 * @ClassName: ThreadLocalDemo
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-05-17 19:30
 */
public class ThreadLocalDemo {

    private static final int HASH_INCREMENT = 0x61c88647;

    public static void main(String[] args) {
        int hashCode = 0;
        for (int i = 0; i < 16; i++) {
            hashCode = i * HASH_INCREMENT + HASH_INCREMENT;
            int bucket = hashCode & 15;
            System.out.println(i + " 在桶中的位置: " + bucket);
        }
    }

}
