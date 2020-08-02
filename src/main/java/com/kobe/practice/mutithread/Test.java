package com.kobe.practice.mutithread;

/**
 * @ClassName: Test
 * @Description: Test
 * @Author: Tao
 * @Date 2020-08-01 19:55
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString((1 << 29)));
        System.out.println(Integer.toBinaryString((1 << 29) - 1));
        System.out.println(Integer.parseInt(Integer.toBinaryString((1 << 29) - 1), 2));
        System.out.println(Integer.toBinaryString(-1 << 29));
    }

}
