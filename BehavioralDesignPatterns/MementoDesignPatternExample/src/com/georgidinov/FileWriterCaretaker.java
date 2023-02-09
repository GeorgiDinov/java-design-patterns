package com.georgidinov;

public class FileWriterCaretaker {

    //consider implementation with a stack of memento objects
    //and maybe swing or FX for text editor application
    //
    private Object object;

    public void save(FileWriterUtil fileWriter) {
        this.object = fileWriter.save();
    }//end of method save

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(this.object);
    }//end of method undo

}//end of class FileWriterCaretaker
