package com.levi.design_patterns.behavioral_pattern.template_pattern;

/**
 * @Class: Football
 * @Description: 足球游戏
 * @Author: Levi
 * @Date: 2026/2/18 11:58
 * @Version: 1.0
 */
public class Football extends Game {
    /**
     * 初始化
     */
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    /**
     * 开始
     */
    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    /**
     * 结束
     */
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
