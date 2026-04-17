package com.levi.design_patterns.structural_pattern.bridge_pattern;

/**
 * @Class: Shape
 * @Description: 形状抽象类
 * @Author: Levi
 * @Date: 2026/2/13 15:21
 * @Version: 1.0
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
