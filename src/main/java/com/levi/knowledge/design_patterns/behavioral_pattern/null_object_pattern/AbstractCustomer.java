package com.levi.knowledge.design_patterns.behavioral_pattern.null_object_pattern;

/**
 * @Class: AbstractCustomer
 * @Description: 顾客（抽象）
 * @Author: Levi
 * @Date: 2026/2/18 11:25
 * @Version: 1.0
 */
public abstract class AbstractCustomer {

    // 顾客姓名
    protected String name;

    /**
     * 是否为空
     *
     * @return
     */
    public abstract boolean isNil();

    /**
     * 获取姓名
     *
     * @return
     */
    public abstract String getName();
}
