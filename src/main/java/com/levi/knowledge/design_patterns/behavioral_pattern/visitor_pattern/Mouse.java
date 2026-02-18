package com.levi.knowledge.design_patterns.behavioral_pattern.visitor_pattern;

/**
 * @Class: Mouse
 * @Description: 鼠标
 * @Author: Levi
 * @Date: 2026/2/18 12:53
 * @Version: 1.0
 */
public class Mouse implements ComputerPart {
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
