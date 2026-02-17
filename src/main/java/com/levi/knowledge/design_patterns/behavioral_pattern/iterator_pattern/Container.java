package com.levi.knowledge.design_patterns.behavioral_pattern.iterator_pattern;

/**
 * @Class: Container
 * @Description: 容器
 * @Author: Levi
 * @Date: 2026/2/17 20:34
 * @Version: 1.0
 */
public interface Container {

    /**
     * 获取迭代器
     *
     * @return
     */
    Iterator getIterator();
}
