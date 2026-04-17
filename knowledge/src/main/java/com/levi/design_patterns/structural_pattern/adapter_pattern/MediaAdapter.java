package com.levi.design_patterns.structural_pattern.adapter_pattern;

/**
 * @Class: MediaAdapter
 * @Description: TODO
 * @Author: Levi
 * @Date: 2026/2/12 16:18
 * @Version: 1.0
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * 有参构造器
     *
     * @param audioType
     */
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    /**
     * 播放
     *
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
