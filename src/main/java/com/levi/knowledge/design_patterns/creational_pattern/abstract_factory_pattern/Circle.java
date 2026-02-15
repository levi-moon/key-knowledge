package com.levi.knowledge.design_patterns.creational_pattern.abstract_factory_pattern;

/**
 * @ClassName: Circle
 * @Description: 圆形
 * @Author: Levi
 * @Date: 2025/12/17 16:29
 */
public class Circle implements Shape {

    /**
     * 画
     */
    @Override
    public void draw() {
        System.out.println("画一个圆形！");
    }
}
