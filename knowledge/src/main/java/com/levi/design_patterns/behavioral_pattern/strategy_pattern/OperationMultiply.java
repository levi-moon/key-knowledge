package com.levi.design_patterns.behavioral_pattern.strategy_pattern;

/**
 * @Class: OperationMultiply
 * @Description: 乘操作
 * @Author: Levi
 * @Date: 2026/2/18 11:46
 * @Version: 1.0
 */
public class OperationMultiply implements Strategy{
    /**
     * 做一些操作
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
