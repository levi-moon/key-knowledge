package com.levi.knowledge.design_patterns.creational_pattern.abstract_factory_pattern;

/**
 * @ClassName: AbstractFactory
 * @Description: 抽象工厂
 * @Author: Levi
 * @Date: 2025/12/17 17:00
 */
public abstract class AbstractFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     *
     * @param shapeType 形状类型
     * @return Shape 形状实现类
     */
    public abstract Shape getShape(String shapeType);

    /**
     * 使用 getColor 方法获取颜色类型的对象
     *
     * @param colorType 颜色类型
     * @return Color 颜色实现类
     */
    public abstract Color getColor(String colorType);
}
