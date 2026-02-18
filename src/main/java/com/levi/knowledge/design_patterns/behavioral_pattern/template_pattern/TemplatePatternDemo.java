package com.levi.knowledge.design_patterns.behavioral_pattern.template_pattern;

/**
 * @Class: TemplatePatternDemo
 * @Description: 模板模式
 * @Author: Levi
 * @Date: 2026/2/18 11:59
 * @Version: 1.0
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        // 构建板球游戏
        Game game = new Cricket();
        game.play();
        System.out.println();

        // 构建足球游戏
        game = new Football();
        game.play();
    }
}
