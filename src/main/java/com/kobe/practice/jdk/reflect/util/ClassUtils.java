package com.kobe.practice.jdk.reflect.util;

import com.kobe.practice.jdk.reflect.Activity;

import java.lang.reflect.Method;

/**
 * @ClassName: ClassUtils
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-07-19 11:54
 */
public class ClassUtils {


    public static int getMethodCountForName(Class<?> clazz, String methodName) {
        int count = 0;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (methodName.equals(method.getName())) {
                count++;
            }
        }
        Class<?>[] ifcs = clazz.getInterfaces();
        for (Class<?> ifc : ifcs) {
            count += getMethodCountForName(ifc, methodName);
        }
        if (clazz.getSuperclass() != null) {
            count += getMethodCountForName(clazz.getSuperclass(), methodName);
        }
        return count;
    }


    public static void main(String[] args) {
        int methodCountForName = getMethodCountForName(Activity.class, "getName");
        System.out.println(methodCountForName);
    }

}
