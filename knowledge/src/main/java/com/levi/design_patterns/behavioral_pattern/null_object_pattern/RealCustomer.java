package com.levi.design_patterns.behavioral_pattern.null_object_pattern;

/**
 * @Class: RealCustomer
 * @Description: 真实的顾客
 * @Author: Levi
 * @Date: 2026/2/18 11:27
 * @Version: 1.0
 */
public class RealCustomer extends AbstractCustomer {

    /**
     * 有参构造器，设置顾客姓名
     *
     * @param name
     */
    public RealCustomer(String name) {
        this.name = name;
    }

    /**
     * 是否为空
     *
     * @return
     */
    @Override
    public boolean isNil() {
        return false;
    }

    /**
     * 获取姓名
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }
}
