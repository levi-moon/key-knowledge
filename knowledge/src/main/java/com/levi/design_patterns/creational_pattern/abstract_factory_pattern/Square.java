package com.levi.design_patterns.creational_pattern.abstract_factory_pattern;

/**
 * @ClassName: Square
 * @Description: 正方形
 * @Author: Levi
 * @Date: 2025/12/17 16:29
 */
public class Square implements Shape {

    /**
     * 画
     */
    @Override
    public void draw() {
        System.out.println("画一个正方形！");
    }
}
