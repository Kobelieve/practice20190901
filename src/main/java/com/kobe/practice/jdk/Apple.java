package com.kobe.practice.jdk;

import com.kobe.practice.jdk.reflect.util.ClassUtils;

/**
 * @ClassName: Apple
 * @Description: Apple
 * @Author: Tao
 * @Date 2020-07-19 13:19
 */
public class Apple implements Fruit, Drink {
    @Override
    public String getName() {
        return "apple";
    }


    @Override
    public String getDrinkName() {
        return "drink apple juice";
    }

    public static void main(String[] args) {
        int num = ClassUtils.getMethodCountForName(Apple.class, "getName");
        System.out.println(num);
    }

}
