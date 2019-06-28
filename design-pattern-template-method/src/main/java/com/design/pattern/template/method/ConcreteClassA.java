package com.design.pattern.template.method;


/**
 * @author summer
 */
public class ConcreteClassA extends AbstractClass {
    /**
     * 预处理
     */
    @Override
    protected void methodA() {
        System.out.println("ConcreteClassA 预处理");
    }

    /**
     * 处理结束
     */
    @Override
    protected void methodB() {
        System.out.println("ConcreteClassA 处理结束");
    }
}
