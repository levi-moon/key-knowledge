package com.levi.knowledge.design_patterns.behavioral_pattern.observer_pattern;

/**
 * @Class: OctalObserver
 * @Description: 八进制观察者
 * @Author: Levi
 * @Date: 2026/2/18 10:44
 * @Version: 1.0
 */
public class OctalObserver extends Observer {

    /**
     * 有参构造器，注册当前观察者
     *
     * @param subject
     */
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * 更新
     */
    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
