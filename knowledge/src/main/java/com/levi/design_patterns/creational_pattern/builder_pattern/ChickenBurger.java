package com.levi.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: ChickenBurger
 * @Description: 鸡肉汉堡
 * @Author: Levi
 * @Date: 2026/2/9 17:18
 * @Version: 1.0
 */
public class ChickenBurger extends Burger{
    /**
     * 食物名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Chicken Burger";
    }

    /**
     * 食物价格
     *
     * @return
     */
    @Override
    public float price() {
        return 50.5f;
    }
}
