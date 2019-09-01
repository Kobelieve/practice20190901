package com.kobe.practice.design.patterns.factory;

/**
 * @ClassName: SimpleFactoryPatternDemo
 * @Description: 简单工程模式
 * @Author: Tao
 * @Date 2019-09-01 21:41
 */
public class SimpleFactoryPatternDemo {

    /**
     * @Author Tao
     * @Description
     *          简单工程模式，一般类名叫XxxFactory，里面有一个静态方法，根据不同的参数，返回不同的派生自同一个父类
     *          （或者实现同一个接口）的实例对象。
     *          强调单一职责原则，一个类只提供一种功能（一个接口也是这样的）
     * @Date 2019-09-01 21:47
     * @Param [name]
     * @return com.kobe.practice.design.patterns.factory.Food
     */
    public static Food getFood(String name) {

        if ("fish".equals(name)) {
            Food fish = new Fish();
            return fish;
        } else if ("chicken".equals(name)) {
            Food chicken = new Chicken();
            return chicken;
        }

        return null;

    }

}
