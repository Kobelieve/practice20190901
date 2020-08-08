package com.kobe.practice.jdk.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: MapDemo01
 * @Description: MapDemo01
 * @Author: Tao
 * @Date 2020-08-08 11:53
 */
public class MapDemo01 {

    public static void main(String[] args) {

        String key = "apple";
        Map<String, String> map = new HashMap<>();
        String result = map.computeIfAbsent(key, k -> {
            System.out.println("key值: " + k);
            return "big";
        });


        System.out.println("computeIfAbsent返回结果: " + result);
        System.out.println("map值: " + map);


        //key值: apple
        //computeIfAbsent返回结果: big
        //map值: {apple=big}
    }

}
