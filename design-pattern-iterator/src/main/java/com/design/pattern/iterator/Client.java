package com.design.pattern.iterator;

/**
 * 请求者
 *
 * @author summer
 */
public class Client {


    public static void main(String[] args) {
        //初始化测试数据
        Apple apple1 = new Apple("红色", "红富士");
        Apple apple2 = new Apple("白色", "白富士");
        ConcreteAggregate box = new ConcreteAggregate();
        box.putApple(apple1);
        box.putApple(apple2);
        //开始迭代遍历
        Iterator<Apple> iterator = box.iterator();
        while (iterator.hasNext()) {
            Apple apple = iterator.next();
            System.out.println(apple);
        }
    }

}
