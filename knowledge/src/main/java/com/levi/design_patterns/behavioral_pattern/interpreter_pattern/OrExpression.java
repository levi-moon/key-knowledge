package com.levi.design_patterns.behavioral_pattern.interpreter_pattern;

/**
 * @Class: OrExpression
 * @Description: 或表达式
 * @Author: Levi
 * @Date: 2026/2/17 18:25
 * @Version: 1.0
 */
public class OrExpression implements Expression {
    // 两个表达式对象
    private Expression expr1 = null;
    private Expression expr2 = null;

    /**
     * 有参构造器
     *
     * @param expr1
     * @param expr2
     */
    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    /**
     * 解释
     *
     * @param context
     * @return
     */
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
