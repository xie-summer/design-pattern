package com.design.pattern.adapter.inherit;

/**
 * 请求者
 * <p>
 * 继承方式适配
 *
 * @author summer
 */
public class Client {

    public static void main(String[] args) {
        //
        Target target = new Adapter();
        target.targetMethodA();
        target.targetMethodB();
    }
}
