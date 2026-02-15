package com.levi.knowledge.design_patterns.structural_pattern.bridge_pattern;

/**
 * @Class: RedCircle
 * @Description: 红色的圆
 * @Author: Levi
 * @Date: 2026/2/13 15:18
 * @Version: 1.0
 */
public class RedCircle implements DrawAPI{
    /**
     * 画圆形
     *
     * @param radius
     * @param x
     * @param y
     */
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
