package com.georgidinov;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }//end of constructor


    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.loadFileName(fileName);
        advancedMediaPlayer.listen();
    }//end of method play

}//end of class AdvancedMediaPlayerAdapter
