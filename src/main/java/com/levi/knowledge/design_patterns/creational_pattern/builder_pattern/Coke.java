package com.levi.knowledge.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: Coke
 * @Description: 可口可乐
 * @Author: Levi
 * @Date: 2026/2/9 17:19
 * @Version: 1.0
 */
public class Coke extends ColdDrink{
    /**
     * 食物名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Coke";
    }

    /**
     * 食物价格
     *
     * @return
     */
    @Override
    public float price() {
        return 30.0f;
    }
}
