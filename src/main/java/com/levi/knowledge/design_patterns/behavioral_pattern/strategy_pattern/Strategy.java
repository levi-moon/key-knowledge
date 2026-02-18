package com.levi.knowledge.design_patterns.behavioral_pattern.strategy_pattern;

/**
 * @Class: Strategy
 * @Description: 策略接口
 * @Author: Levi
 * @Date: 2026/2/18 11:44
 * @Version: 1.0
 */
public interface Strategy {

    /**
     * 做一些操作
     *
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);
}
