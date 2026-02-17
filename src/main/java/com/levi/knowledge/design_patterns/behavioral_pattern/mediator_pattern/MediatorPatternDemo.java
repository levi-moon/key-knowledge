package com.levi.knowledge.design_patterns.behavioral_pattern.mediator_pattern;

/**
 * @Class: MediatorPatternDemo
 * @Description: 中介者模式
 * @Author: Levi
 * @Date: 2026/2/17 20:49
 * @Version: 1.0
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
