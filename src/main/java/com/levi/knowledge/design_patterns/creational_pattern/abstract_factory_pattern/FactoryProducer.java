package com.levi.knowledge.design_patterns.creational_pattern.abstract_factory_pattern;

/**
 * @ClassName: FactoryProducer
 * @Description: 工厂生成器
 * @Author: Levi
 * @Date: 2025/12/17 17:05
 */
public class FactoryProducer {

    /**
     * 获取工厂对象
     *
     * @param choice 要创建的工厂选项
     * @return AbstractFactory 获取对应的工厂
     */
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
