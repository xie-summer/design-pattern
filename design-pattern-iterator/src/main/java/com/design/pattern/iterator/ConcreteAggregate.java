package com.design.pattern.iterator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的集合 此处理解, 装苹果的盒子(一格一格)
 *
 * @author summer
 */
@Data
public class ConcreteAggregate implements Aggregate<Apple> {
    private List<Apple> apples = new ArrayList<>(0);

    public Apple takeAppleByIndex(int index) {
        return apples.get(index);
    }

    public void putApple(Apple apple) {
        apples.add(apple);
    }

    /**
     * @return 获取迭代器(获取具体的迭代器)
     */
    @Override
    public Iterator<Apple> iterator() {
        return new ConcreteIterator(this);
    }
}
