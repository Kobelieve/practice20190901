package com.kobe.practice.jdk.java8;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: IntersectionTest
 * @Description: 求两个集合的交集、差集和并集
 * @Author: Tao
 * @Date 2019-10-19 22:14
 */
public class IntersectionTest {

    public static void main(String[] args) {
        List<String> listA = Lists.newArrayList("AAA", "BBB", "CCC");
        List<String> listB = Lists.newArrayList("CCC", "DDD", "EEE");

        List<String> collectA = listA.stream().filter(t -> listB.contains(t)).collect(Collectors.toList());
        System.out.println("A和B的交集: " + collectA);

        List<String> collectB = listA.stream().filter(t -> !listB.contains(t)).collect(Collectors.toList());
        System.out.println("A和B的差集: " + collectB);

        List<String> collectC = listB.stream().filter(t -> !listA.contains(t)).collect(Collectors.toList());
        System.out.println("B和A的差集: " + collectC);

        List<String> listAll = Lists.newArrayList();
        listAll.addAll(listA);
        listAll.addAll(listB);
        System.out.println("listAll: " + listAll.toString());

        List<String> distinctList = listAll.stream().distinct().collect(Collectors.toList());
        System.out.println("去重后的集合: " + distinctList);

    }

}
