package com.kobe.practice.jdk.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @ClassName: GetSuperclassTest
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-05-31 10:53
 */
public class GetSuperclassTest {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("com.kobe.practice.jdk.reflect.CouponShareActivity");
        Class<?> targetClass = clazz;
        
        do {

            System.out.println("----------------------------------targetClass: " + targetClass.getSimpleName());
            Field[] declaredFields = targetClass.getDeclaredFields();
            Arrays.asList(declaredFields).forEach(field -> System.out.println(field.getName()));
            System.out.println("----------------------------------targetClass: " + targetClass.getSimpleName());

            targetClass = targetClass.getSuperclass();

        } while (targetClass != null && targetClass != Object.class);
        
    }
    
}
