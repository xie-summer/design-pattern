package com.design.pattern.adapter.delegation;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 适配
 *
 * @author summer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Adapter extends AbstractTarget {

    private Adaptee adaptee;

    /**
     * 目标方法A
     */
    @Override
    public void targetMethodA() {
        System.out.println("targetMethodA");
        //进行适配
        adaptee.method1();
    }

    /**
     * 目标方法
     */
    @Override
    public void targetMethodB() {
        System.out.println("targetMethodB");
        //进行适配
        adaptee.method2();
        adaptee.method3();
    }
}
