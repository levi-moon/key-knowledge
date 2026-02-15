package com.levi.knowledge.design_patterns.structural_pattern.adapter_pattern;

/**
 * @Class: AdapterPatternDemo
 * @Description: 适配器模式测试类
 * @Author: Levi
 * @Date: 2026/2/12 16:26
 * @Version: 1.0
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
