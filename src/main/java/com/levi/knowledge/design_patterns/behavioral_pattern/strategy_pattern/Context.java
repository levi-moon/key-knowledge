package com.levi.knowledge.design_patterns.behavioral_pattern.strategy_pattern;

/**
 * @Class: Context
 * @Description: 策略执行的环境
 * @Author: Levi
 * @Date: 2026/2/18 11:46
 * @Version: 1.0
 */
public class Context {

    // 策略对象
    private Strategy strategy;

    /**
     * 有参构造器，设置策略对象
     *
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略，做一些操作
     *
     * @param num1
     * @param num2
     * @return
     */
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
