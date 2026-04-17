package com.levi.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: Pepsi
 * @Description: TODO
 * @Author: Levi
 * @Date: 2026/2/9 17:20
 * @Version: 1.0
 */
public class Pepsi extends ColdDrink{
    /**
     * 食物名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Pepsi";
    }

    /**
     * 食物价格
     *
     * @return
     */
    @Override
    public float price() {
        return 35.0f;
    }
}
