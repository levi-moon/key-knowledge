package com.levi.knowledge.design_patterns.behavioral_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class: Subject
 * @Description: 主题
 * @Author: Levi
 * @Date: 2026/2/18 10:39
 * @Version: 1.0
 */
public class Subject {
    // 观察者集合
    private List<Observer> observers = new ArrayList<Observer>();
    // 状态
    private int state;

    /**
     * 获取状态
     *
     * @return
     */
    public int getState() {
        return state;
    }

    /**
     * 设置状态，并通知所有观察者
     *
     * @param state
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 注册观察者
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
