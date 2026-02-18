package com.levi.knowledge.design_patterns.behavioral_pattern.strategy_pattern;

/**
 * @Class: StrategyPatternDemo
 * @Description: 策略模式
 * @Author: Levi
 * @Date: 2026/2/18 11:47
 * @Version: 1.0
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        // 创建加操作的策略执行环境
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        // 减
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        // 乘
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
