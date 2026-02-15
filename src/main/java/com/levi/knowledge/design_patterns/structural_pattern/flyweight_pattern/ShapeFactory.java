package com.levi.knowledge.design_patterns.structural_pattern.flyweight_pattern;

import java.util.HashMap;

/**
 * @Class: ShapeFactory
 * @Description: 形状工厂
 * @Author: Levi
 * @Date: 2026/2/14 17:22
 * @Version: 1.0
 */
public class ShapeFactory {

    // 圆形集合
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    /**
     * 获取圆形对象
     *
     * @param color
     * @return
     */
    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
