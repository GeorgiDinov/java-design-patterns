package com.georgidinov;

public abstract class AdvancedMediaPlayer {

    protected String fileName;

    abstract void loadFileName(String fileName);

    abstract void listen();

}//end if interface AdvancedMediaPlayer


class VlcPlayer extends AdvancedMediaPlayer {

    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        if (this.fileName.endsWith(".vlc")) {
            System.out.println("\tPlaying vlc file Name: " + this.fileName);
        }else {
            System.out.println("\tInvalid media " +
                    this.fileName.substring(this.fileName.length() - 3) +
                    " format not supported!");
        }
    }

}//end of class VlcPlayer

class Mp4Player extends AdvancedMediaPlayer {

    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        if (this.fileName.endsWith(".mp4")) {
            System.out.println("\tPlaying mp4 file Name: " + this.fileName);
        } else {
            System.out.println("\tInvalid media " +
                    this.fileName.substring(this.fileName.length() - 3) +
                    " format not supported!");
        }
    }

}//end of class Mp4Player