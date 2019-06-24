package com.design.pattern.adapter.inherit;

/**
 * @author summer
 */
public class Adapter extends Adaptee implements Target {
    /**
     * 目标方法A
     */
    @Override
    public void targetMethodA() {
        System.out.println("targetMethodA");
        //进行适配
        super.method1();
    }

    /**
     * 目标方法
     */
    @Override
    public void targetMethodB() {
        System.out.println("targetMethodB");
        //进行适配
        super.method2();
        super.method3();
    }
}
