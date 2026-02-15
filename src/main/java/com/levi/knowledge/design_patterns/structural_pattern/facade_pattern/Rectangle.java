package com.levi.knowledge.design_patterns.structural_pattern.facade_pattern;

/**
 * @Class: Rectangle
 * @Description: 长方形
 * @Author: Levi
 * @Date: 2026/2/14 16:44
 * @Version: 1.0
 */
public class Rectangle implements Shape{
    /**
     * 画图形
     */
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
