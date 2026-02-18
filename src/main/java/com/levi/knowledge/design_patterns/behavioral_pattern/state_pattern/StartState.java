package com.levi.knowledge.design_patterns.behavioral_pattern.state_pattern;

/**
 * @Class: StartState
 * @Description: 开始状态
 * @Author: Levi
 * @Date: 2026/2/18 11:03
 * @Version: 1.0
 */
public class StartState implements State {

    /**
     * 做一些操作
     *
     * @param context
     */
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    /**
     * 重新toString方法，返回此时的状态
     *
     * @return
     */
    public String toString() {
        return "Start State";
    }
}
