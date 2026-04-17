package com.levi.design_patterns.structural_pattern.facade_pattern;

/**
 * @Class: ShapeMaker
 * @Description: 外观类
 * @Author: Levi
 * @Date: 2026/2/14 16:49
 * @Version: 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
