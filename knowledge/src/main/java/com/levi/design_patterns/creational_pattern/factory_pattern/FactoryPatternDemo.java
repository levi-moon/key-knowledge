package com.levi.design_patterns.creational_pattern.factory_pattern;

/**
 * @ClassName: FactoryPatternDemo
 * @Description: 工厂方法模式demo
 * @Author: Levi
 * @Date: 2025/12/17 16:37
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用 Circle 的 draw 方法
        shape1.draw(); // 画一个圆形！

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //调用 Rectangle 的 draw 方法
        shape2.draw(); // 画一个矩形！

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //调用 Square 的 draw 方法
        shape3.draw(); // 画一个正方形！
    }
}
