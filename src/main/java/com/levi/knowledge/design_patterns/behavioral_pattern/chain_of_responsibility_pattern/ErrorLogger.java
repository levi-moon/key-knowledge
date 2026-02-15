package com.levi.knowledge.design_patterns.behavioral_pattern.chain_of_responsibility_pattern;

/**
 * @Class: ErrorLogger
 * @Description: 错误日志
 * @Author: Levi
 * @Date: 2026/2/15 16:27
 * @Version: 1.0
 */
public class ErrorLogger extends AbstractLogger {

    /**
     * 有参构造器
     *
     * @param level 日志等级
     */
    public ErrorLogger(int level) {
        this.level = level;
    }

    /**
     * 记录
     *
     * @param message
     */
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
