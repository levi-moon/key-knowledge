package com.levi.knowledge.design_patterns.behavioral_pattern.visitor_pattern;

/**
 * @Class: ComputerPartDisplayVisitor
 * @Description: 实际访问者
 * @Author: Levi
 * @Date: 2026/2/18 12:57
 * @Version: 1.0
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    /**
     * 访问-使用计算机
     *
     * @param computer
     */
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    /**
     * 使用鼠标
     *
     * @param mouse
     */
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    /**
     * 使用键盘
     *
     * @param keyboard
     */
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    /**
     * 使用显示器
     *
     * @param monitor
     */
    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
