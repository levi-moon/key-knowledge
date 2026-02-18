package com.levi.knowledge.design_patterns.behavioral_pattern.state_pattern;

/**
 * @Class: State
 * @Description: 状态
 * @Author: Levi
 * @Date: 2026/2/18 11:02
 * @Version: 1.0
 */
public interface State {

    /**
     * 做一些操作
     *
     * @param context
     */
    void doAction(Context context);
}
