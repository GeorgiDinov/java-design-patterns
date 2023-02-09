package com.georgidinov;

class Originator {
    private String fileName;
    private StringBuilder content;

    public Originator(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }//end of constructor

    public void write(String text) {
        this.content.append(text);
    }//end of method write

    @Override
    public String toString() {
        return this.content.toString();
    }//end of method toString

    public Object save() {
        return new Memento(this.fileName, this.content.toString());
    }//end of method save

    public void restore(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.fileName;
        this.content = new StringBuilder(memento.content);
    }//end of method restore



    private class Memento {

        private String fileName;
        private String content;

        public Memento(String fileName, String content) {
            this.fileName = fileName;
            this.content = content;
        }//end of constructor


    }//end of inner class Memento

}//end of class Originator
