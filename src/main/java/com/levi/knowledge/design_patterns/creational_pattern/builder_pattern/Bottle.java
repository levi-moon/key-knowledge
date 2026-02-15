package com.levi.knowledge.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: Bottle
 * @Description: 瓶装
 * @Author: Levi
 * @Date: 2026/2/9 17:12
 * @Version: 1.0
 */
public class Bottle implements Packing{
    /**
     * 食物包装
     *
     * @return
     */
    @Override
    public String pack() {
        return "Bottle";
    }
}
