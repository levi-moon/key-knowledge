package com.levi.knowledge.design_patterns.behavioral_pattern.observer_pattern;

/**
 * @Class: ObserverPatternDemo
 * @Description: 观察者模式
 * @Author: Levi
 * @Date: 2026/2/18 10:48
 * @Version: 1.0
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        // 创建主题
        Subject subject = new Subject();

        /* 通过有参构造器，注册对应的观察者 */
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
