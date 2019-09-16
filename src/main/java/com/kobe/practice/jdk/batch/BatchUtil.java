package com.kobe.practice.jdk.batch;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: BatchUtil
 * @Description: 批量处理数据
 * @Author: Tao
 * @Date 2019-09-16 22:38
 */
public class BatchUtil {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(i);
        }
        batchHandleList(list);
    }

    private static void batchHandleList(List<Integer> list) {

        System.out.println(list);
        System.out.println(list.size());
        int temp = 1;
        for (int i = 0; i < list.size(); i += 10) {
            System.out.println("========================进行" + temp + "次批处理=========================");
            if (list.size() - i > 10) {
                System.out.println(list.subList(i, i + 10).toString());
            } else {
                if (list.size() > i) {
                    System.out.println(list.subList(i, list.size()));
                }
            }
            temp += 1;
        }

    }

}
