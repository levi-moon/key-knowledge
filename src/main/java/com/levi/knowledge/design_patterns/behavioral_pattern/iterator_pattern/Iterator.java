package com.levi.knowledge.design_patterns.behavioral_pattern.iterator_pattern;

/**
 * @Class: Iterator
 * @Description: 迭代器
 * @Author: Levi
 * @Date: 2026/2/17 20:33
 * @Version: 1.0
 */
public interface Iterator {

    /**
     * 有下一个
     *
     * @return
     */
    boolean hasNext();

    /**
     * 下一个
     *
     * @return
     */
    Object next();
}
