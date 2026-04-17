package com.levi.design_patterns.behavioral_pattern.visitor_pattern;

/**
 * @Class: ComputerPart
 * @Description: 计算机组成部分
 * @Author: Levi
 * @Date: 2026/2/18 12:09
 * @Version: 1.0
 */
public interface ComputerPart {

    /**
     * 接受
     *
     * @param computerPartVisitor
     */
    void accept(ComputerPartVisitor computerPartVisitor);
}
