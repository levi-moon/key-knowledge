package com.levi.knowledge.design_patterns.behavioral_pattern.template_pattern;

/**
 * @Class: Game
 * @Description: 游戏抽象类
 * @Author: Levi
 * @Date: 2026/2/18 11:56
 * @Version: 1.0
 */
public abstract class Game {
    /**
     * 初始化
     */
    abstract void initialize();

    /**
     * 开始
     */
    abstract void startPlay();

    /**
     * 结束
     */
    abstract void endPlay();

    /**
     * 模板
     */
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
