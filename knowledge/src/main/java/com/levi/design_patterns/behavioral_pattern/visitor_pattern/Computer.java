package com.levi.design_patterns.behavioral_pattern.visitor_pattern;

/**
 * @Class: Computer
 * @Description: 计算机
 * @Author: Levi
 * @Date: 2026/2/18 12:54
 * @Version: 1.0
 */
public class Computer implements ComputerPart {

    // 定义计算机的各个组成部分
    ComputerPart[] parts;

    /**
     * 无参构造器，将各个部分组合起来
     */
    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    /**
     * 接受
     *
     * @param computerPartVisitor
     */
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
