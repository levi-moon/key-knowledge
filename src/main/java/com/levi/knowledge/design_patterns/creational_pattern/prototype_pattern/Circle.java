package com.levi.knowledge.design_patterns.creational_pattern.prototype_pattern;

/**
 * @Class: Circle
 * @Description: 圆
 * @Author: Levi
 * @Date: 2026/2/10 10:22
 * @Version: 1.0
 */
public class Circle extends Shape{

    /**
     * 构造器
     */
    public Circle(){
        type = "Circle";
    }

    /**
     * 画
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
