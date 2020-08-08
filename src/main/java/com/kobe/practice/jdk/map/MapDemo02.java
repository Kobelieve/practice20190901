package com.kobe.practice.jdk.map;

import sun.java2d.pipe.SpanIterator;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: MapDemo02
 * @Description: MapDemo02
 * @Author: Tao
 * @Date 2020-08-08 12:36
 */
public class MapDemo02 {

    /*
        1. key的value如果为null，则不会执行mappingFunction
        2. key的value不为null，则会执行mappingFunction，如果返回值不为null，则替换了key的value；如果返回值为null，则移除该key

     */
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("apple", null);
        String result = map.computeIfPresent("apple", (k, v) -> {
            System.out.println(k);
            System.out.println(v);
            return "delicious";
        });

        System.out.println("computeIfPresent返回结果: " + result);
        System.out.println("map值: " + map);

        //computeIfPresent返回结果: null
        //map值: {apple=null}
    }

}
