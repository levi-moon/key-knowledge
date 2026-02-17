package com.levi.knowledge.design_patterns.behavioral_pattern.command_pattern;

/**
 * @Class: Stock
 * @Description: 交易类
 * @Author: Levi
 * @Date: 2026/2/17 16:11
 * @Version: 1.0
 */
public class Stock {

    // 名称
    private String name = "ABC";
    // 交易量
    private int quantity = 10;

    /**
     * 买入
     */
    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity +" ]bought ");
    }

    /**
     * 卖出
     */
    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity +" ]sold ");
    }
}
