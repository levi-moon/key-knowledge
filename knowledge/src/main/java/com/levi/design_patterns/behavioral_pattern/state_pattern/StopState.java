package com.levi.design_patterns.behavioral_pattern.state_pattern;

/**
 * @Class: StopState
 * @Description: 结束状态
 * @Author: Levi
 * @Date: 2026/2/18 11:04
 * @Version: 1.0
 */
public class StopState implements State {
    /**
     * 做一些操作
     *
     * @param context
     */
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    /**
     * 重新toString方法，返回此时的状态
     *
     * @return
     */
    public String toString() {
        return "Stop State";
    }
}
