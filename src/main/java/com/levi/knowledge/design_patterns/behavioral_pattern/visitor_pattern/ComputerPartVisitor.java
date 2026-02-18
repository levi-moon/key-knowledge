package com.levi.knowledge.design_patterns.behavioral_pattern.visitor_pattern;

/**
 * @Class: ComputerPartVisitor
 * @Description: 计算机使用者接口
 * @Author: Levi
 * @Date: 2026/2/18 12:55
 * @Version: 1.0
 */
public interface ComputerPartVisitor {

    /**
     * 访问-使用计算机
     *
     * @param computer
     */
    void visit(Computer computer);

    /**
     * 使用鼠标
     *
     * @param mouse
     */
    void visit(Mouse mouse);

    /**
     * 使用键盘
     *
     * @param keyboard
     */
    void visit(Keyboard keyboard);

    /**
     * 使用显示器
     *
     * @param monitor
     */
    void visit(Monitor monitor);
}
