package com.levi.design_patterns.behavioral_pattern.command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class: Broker
 * @Description: 经纪人
 * @Author: Levi
 * @Date: 2026/2/17 16:17
 * @Version: 1.0
 */
public class Broker {
    // 订单集合
    private List<Order> orderList = new ArrayList<Order>();

    /**
     * 接受订单
     * @param order
     */
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    /**
     * 下单
     */
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
