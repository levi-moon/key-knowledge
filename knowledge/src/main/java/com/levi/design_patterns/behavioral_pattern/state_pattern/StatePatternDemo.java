package com.levi.design_patterns.behavioral_pattern.state_pattern;

/**
 * @Class: StatePatternDemo
 * @Description: 状态模式
 * @Author: Levi
 * @Date: 2026/2/18 11:05
 * @Version: 1.0
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        // 构建上下文
        Context context = new Context();

        // 构建开始状态，并做一些操作
        StartState startState = new StartState();
        startState.doAction(context);

        // 打印此时的状态
        System.out.println(context.getState().toString());

        // 构建结束状态，并做一些操作
        StopState stopState = new StopState();
        stopState.doAction(context);

        // 打印此时的状态
        System.out.println(context.getState().toString());
    }
}
