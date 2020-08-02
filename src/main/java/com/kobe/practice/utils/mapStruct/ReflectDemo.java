package com.kobe.practice.utils.mapStruct;

import java.lang.reflect.Field;

/**
 * @ClassName: ReflectDemo
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-05-06 23:09
 */
public class ReflectDemo {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.kobe.practice.utils.mapStruct.Student");
        Student student = new Student();
        student.setUserage(22);
        student.setUsername("nihao");
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(field.get(student));
        }
    }

}
