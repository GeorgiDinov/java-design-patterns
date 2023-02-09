package com.georgidinov;

import javax.naming.OperationNotSupportedException;

public interface MediaPlayer {
    void play(String audioType, String fileName);
}//end of interface MediaPlayer

class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType == null || fileName == null) {
            System.out.println("Invalid values!");
            return;
        }
        if (audioType.contains("mp3") && fileName.endsWith(".mp3")) {
            System.out.println("\tPlaying mp3 file Name: " + fileName);

        } else {
            System.out.println("Invalid media " + audioType + "format not supported!");
        }
    }//end of method play

}//end of class AudioPlayer
