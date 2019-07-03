package com.design.pattern.singleton;

/**
 * 请求者
 *
 * @author summer
 */
public class Client {


    public static void main(String[] args) {
        AbstractClass concreteClassA = new ConcreteClassA();
        AbstractClass concreteClassB = new ConcreteClassB();
        concreteClassA.process();
        concreteClassB.process();
    }

}
