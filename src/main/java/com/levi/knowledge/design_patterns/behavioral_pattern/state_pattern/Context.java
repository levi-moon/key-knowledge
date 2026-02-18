package com.levi.knowledge.design_patterns.behavioral_pattern.state_pattern;

/**
 * @Class: Context
 * @Description: 上下文
 * @Author: Levi
 * @Date: 2026/2/18 11:04
 * @Version: 1.0
 */
public class Context {
    // 状态对象
    private State state;

    /**
     * 无参构造器，重置状态对象
     */
    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
