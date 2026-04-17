package com.levi.design_patterns.behavioral_pattern.command_pattern;

/**
 * @Class: CommandPatternDemo
 * @Description: 命令模式
 * @Author: Levi
 * @Date: 2026/2/17 16:31
 * @Version: 1.0
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        // 创建abc股票
        Stock abcStock = new Stock();
        // 买单
        BuyStock buyStockOrder = new BuyStock(abcStock);
        // 卖单
        SellStock sellStockOrder = new SellStock(abcStock);

        // 创建经纪人
        Broker broker = new Broker();
        // 经纪人接收买、卖单
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        // 经纪人下单
        broker.placeOrders();
    }
}
