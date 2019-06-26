package com.design.pattern.iterator;

/**
 * 迭代器接口
 *
 * @param <T> 子类通过泛型指定迭代器内部元素类型
 * @author summer
 */
public interface Iterator<T> {

    /**
     * @return 是否存在下一个元素
     */
    public boolean hasNext();

    public T next();
}
