package com.levi.knowledge.design_patterns.behavioral_pattern.command_pattern;


/**
 * @Class: SellStock
 * @Description: 卖出股票
 * @Author: Levi
 * @Date: 2026/2/17 16:14
 * @Version: 1.0
 */
public class SellStock implements Order {
    // abc股票
    private Stock abcStock;

    /**
     * 卖出股票
     *
     * @param abcStock
     */
    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    /**
     * 执行
     */
    @Override
    public void execute() {
        abcStock.sell();
    }
}
