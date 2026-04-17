package com.levi.design_patterns.creational_pattern.abstract_factory_pattern;

/**
 * @ClassName: Rectangle
 * @Description: 矩形
 * @Author: Levi
 * @Date: 2025/12/17 16:28
 */
public class Rectangle implements Shape {

    /**
     * 画
     */
    @Override
    public void draw() {
        System.out.println("画一个矩形！");
    }
}
