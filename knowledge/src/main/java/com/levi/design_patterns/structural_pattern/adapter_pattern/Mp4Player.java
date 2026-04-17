package com.levi.design_patterns.structural_pattern.adapter_pattern;

/**
 * @Class: Mp4Player
 * @Description: mp4格式播放器
 * @Author: Levi
 * @Date: 2026/2/12 16:17
 * @Version: 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer{
    /**
     * 播放vlc格式的文件
     *
     * @param fileName
     */
    @Override
    public void playVlc(String fileName) {

    }

    /**
     * 播放mp4格式的文件
     *
     * @param fileName
     */
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
