package com.levi.knowledge.design_patterns.behavioral_pattern.memento_pattern;

/**
 * @Class: Originator
 * @Description: 创建者
 * @Author: Levi
 * @Date: 2026/2/17 21:00
 * @Version: 1.0
 */
public class Originator {

    // 状态
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    /**
     * 保存状态到备忘录
     *
     * @return
     */
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * 从备忘录获取状态
     *
     * @param Memento
     */
    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
