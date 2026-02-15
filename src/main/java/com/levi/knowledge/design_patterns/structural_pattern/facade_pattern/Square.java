package com.levi.knowledge.design_patterns.structural_pattern.facade_pattern;

/**
 * @Class: Square
 * @Description: 正方形
 * @Author: Levi
 * @Date: 2026/2/14 16:48
 * @Version: 1.0
 */
public class Square implements Shape{
    /**
     * 画图形
     */
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
