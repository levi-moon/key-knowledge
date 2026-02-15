package com.levi.knowledge.design_patterns.structural_pattern.bridge_pattern;

/**
 * @Class: GreenCircle
 * @Description: 绿色的圆
 * @Author: Levi
 * @Date: 2026/2/13 15:19
 * @Version: 1.0
 */
public class GreenCircle implements DrawAPI {
    /**
     * 画圆形
     *
     * @param radius
     * @param x
     * @param y
     */
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
