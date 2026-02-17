package com.levi.knowledge.design_patterns.behavioral_pattern.interpreter_pattern;

/**
 * @Class: Expression
 * @Description: 表达式接口
 * @Author: Levi
 * @Date: 2026/2/17 18:23
 * @Version: 1.0
 */
public interface Expression {

    /**
     * 解释
     *
     * @param context
     * @return
     */
    boolean interpret(String context);
}
