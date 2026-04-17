package com.levi.design_patterns.behavioral_pattern.chain_of_responsibility_pattern;

/**
 * @Class: ConsoleLogger
 * @Description: 控制台日志
 * @Author: Levi
 * @Date: 2026/2/15 16:25
 * @Version: 1.0
 */
public class ConsoleLogger extends AbstractLogger {

    /**
     * 有参构造器
     *
     * @param level 日志等级
     */
    public ConsoleLogger(int level) {
        this.level = level;
    }

    /**
     * 记录
     *
     * @param message
     */
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
