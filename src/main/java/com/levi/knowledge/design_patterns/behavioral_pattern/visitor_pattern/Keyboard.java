package com.levi.knowledge.design_patterns.behavioral_pattern.visitor_pattern;

/**
 * @Class: Keyboard
 * @Description: 键盘
 * @Author: Levi
 * @Date: 2026/2/18 12:09
 * @Version: 1.0
 */
public class Keyboard implements ComputerPart{
    /**
     * 接受
     *
     * @param computerPartVisitor
     */
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
