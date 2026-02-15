package com.levi.knowledge.design_patterns.structural_pattern.adapter_pattern;

/**
 * @Class: AdvancedMediaPlayer
 * @Description: 更高级的媒体播放器
 * @Author: Levi
 * @Date: 2026/2/12 16:14
 * @Version: 1.0
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放vlc格式的文件
     * @param fileName
     */
    void playVlc(String fileName);

    /**
     * 播放mp4格式的文件
     * @param fileName
     */
    void playMp4(String fileName);
}
