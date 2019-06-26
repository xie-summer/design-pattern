package com.design.pattern.iterator;

/** 集合概念定义
 * @author summer
 */
public interface Aggregate<T> {

    /**
     * @return 获取迭代器
     */
    public Iterator<T> iterator();
}
