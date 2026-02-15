package com.levi.knowledge.design_patterns.structural_pattern.flyweight_pattern;

/**
 * @Class: FlyweightPatternDemo
 * @Description: 享元模式
 * @Author: Levi
 * @Date: 2026/2/14 17:23
 * @Version: 1.0
 */
public class FlyweightPatternDemo {

    // 颜色集合
    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
