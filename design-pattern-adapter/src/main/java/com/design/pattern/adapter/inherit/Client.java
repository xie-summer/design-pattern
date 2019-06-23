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
        //被适配
        Adaptee adaptee = new Adaptee();
        //适配
        Adapter adapter = new Adapter();
        //设置被适配对象
        adapter.setAdaptee(adaptee);
        //目标方法A
        adapter.targetMethodA();
        //目标方法B
        adapter.targetMethodB();
    }
}
