package com.levi.knowledge.design_patterns.behavioral_pattern.chain_of_responsibility_pattern;

/**
 * @Class: AbstractLogger
 * @Description: 记录器抽象类
 * @Author: Levi
 * @Date: 2026/2/15 16:23
 * @Version: 1.0
 */
public abstract class AbstractLogger {

    /*定义日志级别代码*/
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    // 日志等级
    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    /**
     * 设置下一级日志
     *
     * @param nextLogger
     */
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 日志内容对象
     *
     * @param level
     * @param message
     */
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 记录
     *
     * @param message
     */
    abstract protected void write(String message);
}
