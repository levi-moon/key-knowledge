package com.levi.design_patterns.behavioral_pattern.template_pattern;

/**
 * @Class: Cricket
 * @Description: 板球游戏
 * @Author: Levi
 * @Date: 2026/2/18 11:57
 * @Version: 1.0
 */
public class Cricket extends Game {
    /**
     * 初始化
     */
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    /**
     * 开始
     */
    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    /**
     * 结束
     */
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
