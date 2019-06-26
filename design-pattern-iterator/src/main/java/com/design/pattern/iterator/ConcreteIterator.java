package com.design.pattern.iterator;

/**
 * @author summer
 */

public class ConcreteIterator implements Iterator<Apple> {
    private ConcreteAggregate aggregate;
    /**
     * 从第一个元素开始遍历
     */
    private int index = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    /**
     * @return 是否存在下一个元素
     */
    @Override
    public boolean hasNext() {
        return index < aggregate.getApples().size();
    }

    /**
     * @return 获取下一个元素
     */
    @Override
    public Apple next() {
        Apple apple = aggregate.takeAppleByIndex(index);
        index++;
        return apple;
    }
}
