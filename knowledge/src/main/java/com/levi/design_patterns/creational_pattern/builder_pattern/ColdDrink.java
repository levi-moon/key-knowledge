package com.levi.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: ColdDrink
 * @Description: TODO
 * @Author: Levi
 * @Date: 2026/2/9 17:15
 * @Version: 1.0
 */
public abstract class ColdDrink implements Item{

    /**
     * 打包食物
     *
     * @return
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 食物价格
     *
     * @return
     */
    @Override
    public abstract float price();
}
