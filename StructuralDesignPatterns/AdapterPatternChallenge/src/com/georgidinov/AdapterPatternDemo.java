package com.georgidinov;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Adapter Design Pattern>>>\n");
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Song.mp3");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        AdvancedMediaPlayer mp4Player = new Mp4Player();
        AdvancedMediaPlayerAdapter adaptedPlayer = new AdvancedMediaPlayerAdapter(vlcPlayer);
        adaptedPlayer.play("vlc", "Song.vlc");
        adaptedPlayer = new AdvancedMediaPlayerAdapter(mp4Player);
        adaptedPlayer.play("mp4", "Song.mp4");

        adaptedPlayer.play("avi", "Song.avi");
    }//end of main method

}//end of class AdapterPatternDemo
