package com.levi.design_patterns.behavioral_pattern.observer_pattern;

/**
 * @Class: HexaObserver
 * @Description: 十六进制观察者
 * @Author: Levi
 * @Date: 2026/2/18 10:46
 * @Version: 1.0
 */
public class HexaObserver extends Observer {

    /**
     * 有参构造器，注册当前观察者
     *
     * @param subject
     */
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * 更新
     */
    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
