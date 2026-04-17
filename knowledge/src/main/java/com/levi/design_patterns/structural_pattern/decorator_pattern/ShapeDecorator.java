package com.levi.design_patterns.structural_pattern.decorator_pattern;

/**
 * @Class: ShapeDecorator
 * @Description: 抽象装饰类
 * @Author: Levi
 * @Date: 2026/2/14 15:51
 * @Version: 1.0
 */
public abstract class ShapeDecorator implements Shape{

    // 装饰形状
    protected Shape decoratedShape;

    /**
     * 形状装饰器
     * @param decoratedShape
     */
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    /**
     * 画形状
     */
    public void draw(){
        decoratedShape.draw();
    }
}
