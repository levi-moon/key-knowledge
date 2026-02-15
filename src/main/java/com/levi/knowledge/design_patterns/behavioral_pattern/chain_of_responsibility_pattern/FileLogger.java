package com.levi.knowledge.design_patterns.behavioral_pattern.chain_of_responsibility_pattern;

/**
 * @Class: FileLogger
 * @Description: 文件日志
 * @Author: Levi
 * @Date: 2026/2/15 16:28
 * @Version: 1.0
 */
public class FileLogger extends AbstractLogger{

    /**
     * 有参构造器
     *
     * @param level 日志等级
     */
    public FileLogger(int level){
        this.level = level;
    }

    /**
     * 记录
     *
     * @param message
     */
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
