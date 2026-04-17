package com.levi.design_patterns.behavioral_pattern.command_pattern;

/**
 * @Class: BuyStock
 * @Description: 买入股票
 * @Author: Levi
 * @Date: 2026/2/17 16:12
 * @Version: 1.0
 */
public class BuyStock implements Order {

    // abc股票
    private Stock abcStock;

    /**
     * 有参构造器
     *
     * @param abcStock
     */
    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    /**
     * 执行
     */
    @Override
    public void execute() {
        abcStock.buy();
    }
}
