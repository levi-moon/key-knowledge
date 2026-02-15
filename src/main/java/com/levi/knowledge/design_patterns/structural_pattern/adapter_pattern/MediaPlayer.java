package com.levi.knowledge.design_patterns.structural_pattern.adapter_pattern;

/**
 * @Class: MediaPlayer
 * @Description: 媒体播放器
 * @Author: Levi
 * @Date: 2026/2/12 16:13
 * @Version: 1.0
 */
public interface MediaPlayer {

    /**
     * 播放
     * @param audioType
     * @param fileName
     */
    void play(String audioType, String fileName);
}
