package com.levi.knowledge.design_patterns.structural_pattern.bridge_pattern;

/**
 * @Class: BridgePatternDemo
 * @Description: 桥接模式
 * @Author: Levi
 * @Date: 2026/2/13 15:24
 * @Version: 1.0
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
