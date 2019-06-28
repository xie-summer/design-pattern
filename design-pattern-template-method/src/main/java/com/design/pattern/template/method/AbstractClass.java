package com.design.pattern.template.method;

/**
 * 抽象类
 *
 * @author summer
 */
public abstract class AbstractClass {

    /**
     * 预处理
     */
    protected abstract void methodA();

    /**
     * 处理结束
     */
    protected abstract void methodB();

    /**
     * 处理逻辑
     */
    public void process() {
        methodA();
        methodB();
    }
}
