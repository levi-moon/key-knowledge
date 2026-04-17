package com.levi.design_patterns.behavioral_pattern.interpreter_pattern;

/**
 * @Class: TerminalExpression
 * @Description: 终端公式
 * @Author: Levi
 * @Date: 2026/2/17 18:24
 * @Version: 1.0
 */
public class TerminalExpression implements Expression {

    // 数据
    private String data;

    /**
     * 有参构造器
     *
     * @param data
     */
    public TerminalExpression(String data) {
        this.data = data;
    }

    /**
     * 解释
     *
     * @param context
     * @return
     */
    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
