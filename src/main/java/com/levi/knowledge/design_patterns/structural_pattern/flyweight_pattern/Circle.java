package com.levi.knowledge.design_patterns.structural_pattern.flyweight_pattern;

/**
 * @Class: Circle
 * @Description: 圆形
 * @Author: Levi
 * @Date: 2026/2/14 17:19
 * @Version: 1.0
 */
public class Circle implements Shape {

    // 颜色
    private String color;
    // x坐标
    private int x;
    // y坐标
    private int y;
    // 半径
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    /**
     * 设置x坐标
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * 设置y坐标
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * 设置半径
     *
     * @param radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * 画形状
     */
    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
