package com.levi.design_patterns.behavioral_pattern.memento_pattern;

/**
 * @Class: Memento
 * @Description: 备忘录对象
 * @Author: Levi
 * @Date: 2026/2/17 20:59
 * @Version: 1.0
 */
public class Memento {

    // 状态
    private String state;

    /**
     * 有参构造器
     *
     * @param state
     */
    public Memento(String state) {
        this.state = state;
    }

    /**
     * 获取状态
     *
     * @return
     */
    public String getState() {
        return state;
    }
}
