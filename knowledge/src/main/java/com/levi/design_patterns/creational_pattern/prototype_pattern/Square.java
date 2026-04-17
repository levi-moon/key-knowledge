package com.levi.design_patterns.creational_pattern.prototype_pattern;

/**
 * @Class: Square
 * @Description: 正方形
 * @Author: Levi
 * @Date: 2026/2/10 10:20
 * @Version: 1.0
 */
public class Square extends Shape{

    /**
     * 构造器
     */
    public Square(){
        type = "Square";
    }

    /**
     * 画
     */
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
