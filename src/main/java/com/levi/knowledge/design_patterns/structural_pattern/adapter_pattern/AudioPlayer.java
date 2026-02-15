package com.levi.knowledge.design_patterns.structural_pattern.adapter_pattern;

/**
 * @Class: AudioPlayer
 * @Description: TODO
 * @Author: Levi
 * @Date: 2026/2/12 16:21
 * @Version: 1.0
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    /**
     * 播放
     *
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            //播放 mp3 音乐文件的内置支持
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            //mediaAdapter 提供了播放其他文件格式的支持
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
