package com.levi.design_patterns.behavioral_pattern.visitor_pattern;

/**
 * @Class: VisitorPatternDemo
 * @Description: 访问者模式
 * @Author: Levi
 * @Date: 2026/2/18 12:59
 * @Version: 1.0
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        // 构建计算机的各个部分
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
