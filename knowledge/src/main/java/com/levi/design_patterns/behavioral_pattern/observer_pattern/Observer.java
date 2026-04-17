package com.levi.design_patterns.behavioral_pattern.observer_pattern;

/**
 * @Class: Observer
 * @Description: 观察者
 * @Author: Levi
 * @Date: 2026/2/18 10:41
 * @Version: 1.0
 */
public abstract class Observer {

    // 主题
    protected Subject subject;

    /**
     * 更新
     */
    public abstract void update();
}
