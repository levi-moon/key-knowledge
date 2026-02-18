package com.levi.knowledge.design_patterns.behavioral_pattern.null_object_pattern;

/**
 * @Class: NullCustomer
 * @Description: 空对象的顾客
 * @Author: Levi
 * @Date: 2026/2/18 11:28
 * @Version: 1.0
 */
public class NullCustomer extends AbstractCustomer{
    /**
     * 是否为空
     *
     * @return
     */
    @Override
    public boolean isNil() {
        return true;
    }

    /**
     * 获取姓名
     *
     * @return
     */
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
