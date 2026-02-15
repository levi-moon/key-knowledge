package com.levi.knowledge.design_patterns.creational_pattern.prototype_pattern;

/**
 * @Class: Rectangle
 * @Description: 长方形
 * @Author: Levi
 * @Date: 2026/2/10 10:09
 * @Version: 1.0
 */
public class Rectangle extends Shape{

    /**
     * 构造器
     */
    public Rectangle(){
        type = "Rectangle";
    }

    /**
     * 画
     */
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
