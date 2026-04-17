package com.levi.design_patterns.structural_pattern.bridge_pattern;

/**
 * @Class: Circle
 * @Description: 圆形
 * @Author: Levi
 * @Date: 2026/2/13 15:22
 * @Version: 1.0
 */
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * 画
     */
    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
