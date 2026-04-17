package com.levi.design_patterns.creational_pattern.abstract_factory_pattern;

/**
 * @ClassName: Red
 * @Description: 红色
 * @Author: Levi
 * @Date: 2025/12/17 16:59
 */
public class Red implements Color {
    /**
     * 填充
     */
    @Override
    public void fill() {
        System.out.println("填充红色！");
    }
}
