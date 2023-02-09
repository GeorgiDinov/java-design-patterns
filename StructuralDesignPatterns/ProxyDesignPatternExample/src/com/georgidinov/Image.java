package com.georgidinov;

//Subject
interface Image {
    void display();
}//end of interface Image

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(this.fileName);
    }//end of constructor

    private void loadFromDisk(String fileName) {
        System.out.println("Loading the " + fileName);
    }//end of method loadFromDisk


    @Override
    public void display() {
        System.out.println("Displaying the " + this.fileName);
    }//end of method display

}//end of class RealImage
