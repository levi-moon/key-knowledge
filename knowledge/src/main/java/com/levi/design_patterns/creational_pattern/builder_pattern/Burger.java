package com.levi.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: Burger
 * @Description: 汉堡包
 * @Author: Levi
 * @Date: 2026/2/9 17:13
 * @Version: 1.0
 */
public abstract class Burger implements Item{

    /**
     * 打包食物
     *
     * @return
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 食物价格
     *
     * @return
     */
    @Override
    public abstract float price();
}
