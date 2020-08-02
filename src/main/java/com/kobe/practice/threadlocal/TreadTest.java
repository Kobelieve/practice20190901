package com.kobe.practice.threadlocal;

import com.google.errorprone.annotations.Var;

import java.util.HashMap;

/**
 * @ClassName: TreadTest
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-05-16 11:43
 */
public class TreadTest {

    // 初始化
    public static ThreadLocal<String> stringThreadLocal = ThreadLocal.withInitial(String::new);
//    public static ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        String s = stringThreadLocal.get();
        System.out.println(s.toString());
    }

}
