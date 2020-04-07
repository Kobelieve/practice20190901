package com.kobe.practice.jdk.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: CollectionDemo
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-01-04 13:23
 */
public class CollectionDemo {

    public static Predicate<String> startA = x -> x.startsWith("aa");

    public static void main(String[] args) {
        String[] strArray = {"aa", "bb", "cc"};
        List<String> collect = Stream.of(strArray)
                .filter(CollectionDemo.startA)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(String.format("%02d", 1));
    }

}
