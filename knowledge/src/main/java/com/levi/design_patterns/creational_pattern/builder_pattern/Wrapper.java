package com.levi.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: Wrapper
 * @Description: 袋装
 * @Author: Levi
 * @Date: 2026/2/9 17:11
 * @Version: 1.0
 */
public class Wrapper implements Packing{
    /**
     * 食物包装
     *
     * @return
     */
    @Override
    public String pack() {
        return "Wrapper";
    }
}
