package com.design.pattern.singleton;

/**
 * 单例模式-演示3-懒汉式
 *
 * @author summer
 */
public final class Singleton {

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }


    /**
     * 第一步私有化构造函数
     */
    private Singleton() {
    }

    /**
     * 第二步  提供静态获取实例的方法
     *
     * @return 实例引用
     *//*
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }*/
}
