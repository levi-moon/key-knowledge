package com.levi.design_patterns.structural_pattern.adapter_pattern;

/**
 * @Class: VlcPlayer
 * @Description: vlc格式播放器
 * @Author: Levi
 * @Date: 2026/2/12 16:16
 * @Version: 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    /**
     * 播放vlc格式的文件
     *
     * @param fileName
     */
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    /**
     * 播放mp4格式的文件
     *
     * @param fileName
     */
    @Override
    public void playMp4(String fileName) {

    }
}
