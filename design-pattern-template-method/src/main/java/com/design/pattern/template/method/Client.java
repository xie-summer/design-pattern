package com.design.pattern.template.method;

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
