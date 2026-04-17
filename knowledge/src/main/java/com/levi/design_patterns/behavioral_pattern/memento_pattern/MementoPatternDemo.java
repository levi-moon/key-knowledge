package com.levi.design_patterns.behavioral_pattern.memento_pattern;

/**
 * @Class: MementoPatternDemo
 * @Description: 备忘录模式
 * @Author: Levi
 * @Date: 2026/2/17 21:02
 * @Version: 1.0
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        // 生成创建人
        Originator originator = new Originator();
        // 生成负责人
        CareTaker careTaker = new CareTaker();

        // 创建人设置状态
        originator.setState("State #1");
        originator.setState("State #2");
        // 负责人将创建人的备忘录进行记录
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
