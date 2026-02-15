package com.levi.knowledge.design_patterns.creational_pattern.abstract_factory_pattern;

/**
 * @ClassName: ShapeFactory
 * @Description: 形状创建工厂
 * @Author: Levi
 * @Date: 2025/12/17 16:35
 */
public class ShapeFactory extends AbstractFactory{

    /**
     * 使用 getShape 方法获取形状类型的对象
     * @param shapeType 形状类型
     * @return Shape 形状实现类
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    /**
     * 使用 getColor 方法获取颜色类型的对象
     *
     * @param colorType 颜色类型
     * @return Color 颜色实现类
     */
    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
