package com.levi.knowledge.design_patterns.structural_pattern.decorator_pattern;

/**
 * @Class: RedShapeDecorator
 * @Description: 实体装饰类
 * @Author: Levi
 * @Date: 2026/2/14 15:54
 * @Version: 1.0
 */
public class RedShapeDecorator extends ShapeDecorator {

    /**
     * 红色形状装饰
     * @param decoratedShape
     */
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    /**
     * 画形状
     */
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    /**
     * 设置红色边框
     * @param decoratedShape
     */
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
