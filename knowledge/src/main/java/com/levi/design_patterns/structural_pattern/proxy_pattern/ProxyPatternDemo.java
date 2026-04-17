package com.levi.design_patterns.structural_pattern.proxy_pattern;

/**
 * @Class: ProxyPatternDemo
 * @Description: 代理模式
 * @Author: Levi
 * @Date: 2026/2/15 15:42
 * @Version: 1.0
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
