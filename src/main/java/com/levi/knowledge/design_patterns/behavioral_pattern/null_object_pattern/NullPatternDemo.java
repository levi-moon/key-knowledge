package com.levi.knowledge.design_patterns.behavioral_pattern.null_object_pattern;

/**
 * @Class: NullPatternDemo
 * @Description: 空对象模式
 * @Author: Levi
 * @Date: 2026/2/18 11:30
 * @Version: 1.0
 */
public class NullPatternDemo {

    public static void main(String[] args) {
        // 创建多个顾客对象
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        /**
         * 获取顾客姓名
         */
        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
