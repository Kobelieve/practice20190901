package com.kobe.practice.utils.mapStruct;

import org.mapstruct.factory.Mappers;

/**
 * @ClassName: TestMyDemo
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-04-06 18:31
 */
public class TestMyDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(11);
        person.setName("nn");

        Student student = HumanMapper.INSTANCE.entity2Student(person);
        System.out.println(student);

    }

}
