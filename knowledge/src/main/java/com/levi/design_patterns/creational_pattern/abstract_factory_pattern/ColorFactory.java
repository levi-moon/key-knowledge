package com.levi.design_patterns.creational_pattern.abstract_factory_pattern;

/**
 * @ClassName: ColorFactory
 * @Description: 颜色创建工厂
 * @Author: Levi
 * @Date: 2025/12/17 17:04
 */
public class ColorFactory extends AbstractFactory{
    /**
     * 使用 getShape 方法获取形状类型的对象
     *
     * @param shapeType 形状类型
     * @return Shape 形状实现类
     */
    @Override
    public Shape getShape(String shapeType) {
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
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
