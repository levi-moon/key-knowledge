package com.levi.design_patterns.structural_pattern.decorator_pattern;

/**
 * @Class: Rectangle
 * @Description: 长方形
 * @Author: Levi
 * @Date: 2026/2/14 15:50
 * @Version: 1.0
 */
public class Rectangle implements Shape {
    /**
     * 画图形
     */
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
