package com.levi.knowledge.design_patterns.creational_pattern.abstract_factory_pattern;

/**
 * @ClassName: Red
 * @Description: 绿色
 * @Author: Levi
 * @Date: 2025/12/17 16:59
 */
public class Green implements Color {
    /**
     * 填充
     */
    @Override
    public void fill() {
        System.out.println("填充绿色！");
    }
}
