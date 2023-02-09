package com.georgidinov;

//the Originator
public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }//end of constructor

    @Override
    public String toString() {
        return this.content.toString();
    }//end of method toString

    public void write(String str) {
        this.content.append(str);
    }//end of method write

    //creates the memento
    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    //restore
    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

    private class Memento {

        private final String fileName;
        private final StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            //notice the deep copy so the memento and the fileWriter
            // don't refer to the same object
            this.content = new StringBuilder(content);
        }//end of constructor

    }//end of class Memento

}//end of class FileWriterUtil
