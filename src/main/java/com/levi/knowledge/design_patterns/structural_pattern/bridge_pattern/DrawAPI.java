package com.levi.knowledge.design_patterns.structural_pattern.bridge_pattern;

/**
 * @Class: DrawAPI
 * @Description: 画图形的接口
 * @Author: Levi
 * @Date: 2026/2/13 15:09
 * @Version: 1.0
 */
public interface DrawAPI {

    /**
     * 画圆形
     * @param radius
     * @param x
     * @param y
     */
    void drawCircle(int radius, int x, int y);
}
