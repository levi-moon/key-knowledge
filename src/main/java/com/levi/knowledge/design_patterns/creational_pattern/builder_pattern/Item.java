package com.levi.knowledge.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: Item
 * @Description: 食物条目接口
 * @Author: Levi
 * @Date: 2026/2/9 17:06
 * @Version: 1.0
 */
public interface Item {
    /**
     * 食物名称
     * @return
     */
    String name();

    /**
     * 打包食物
     * @return
     */
    Packing packing();

    /**
     * 食物价格
     * @return
     */
    float price();
}
