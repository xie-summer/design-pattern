package com.design.pattern.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *  苹果(集合中元素)
 * @author summer
 */
@AllArgsConstructor
@Data
public class Apple {
    /**
     * 颜色
     */
    private String colour;

    /**
     * 品种
     */
    private String variety;
}
