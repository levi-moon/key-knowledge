package com.levi.design_patterns.structural_pattern.facade_pattern;

/**
 * @Class: FacadePatternDemo
 * @Description: 外观模式
 * @Author: Levi
 * @Date: 2026/2/14 16:49
 * @Version: 1.0
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
