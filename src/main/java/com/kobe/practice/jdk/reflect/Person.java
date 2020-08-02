package com.kobe.practice.jdk.reflect;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-05-23 16:03
 */
public class Person {

    private String name;

    private int age;

    private Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void hello(String str) {
        System.out.println(str);
    }
}
