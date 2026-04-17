package com.levi.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: VegBurger
 * @Description: 素菜汉堡
 * @Author: Levi
 * @Date: 2026/2/9 17:16
 * @Version: 1.0
 */
public class VegBurger extends Burger{
    /**
     * 食物名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Veg Burger";
    }

    /**
     * 食物价格
     *
     * @return
     */
    @Override
    public float price() {
        return 25.0f;
    }
}
