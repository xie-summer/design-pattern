package com.design.pattern.template.method;


/**
 * @author summer
 */
public class ConcreteClassB extends AbstractClass {
    /**
     * 预处理
     */
    @Override
    protected void methodA() {
        System.out.println("ConcreteClassB 预处理");
    }

    /**
     * 处理结束
     */
    @Override
    protected void methodB() {
        System.out.println("ConcreteClassB 处理结束");
    }
}
