package com.levi.design_patterns.behavioral_pattern.null_object_pattern;

/**
 * @Class: CustomerFactory
 * @Description: 顾客工厂
 * @Author: Levi
 * @Date: 2026/2/18 11:29
 * @Version: 1.0
 */
public class CustomerFactory {

    // 姓名集合
    public static final String[] names = {"Rob", "Joe", "Julie"};

    /**
     * 通过姓名获取顾客
     *
     * @param name
     * @return
     */
    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
