package com.kobe.practice.jdk.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: MapDemo03
 * @Description: MapDemo03
 * @Author: Tao
 * @Date 2020-08-08 12:50
 */
public class MapDemo03 {

    /*
            1. 当存在指定的key且value不为null，则不覆盖此key，并返回当前的value
            2. 当不存在指定的key或者存在key且value为null时，则将其加入map中，并返回null
         */
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        String result = map.putIfAbsent("apple", "soa");

        System.out.println("putIfAbsent返回：" + result);
        System.out.println("map值: " + map);

        //putIfAbsent返回：null
        //map值: {apple=soa}

    }

}
