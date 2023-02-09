package com.georgidinov;

class ProxyImage implements Image {
    private RealImage realImage;
    private  String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (this.realImage == null) {
            this.realImage = new RealImage(fileName);
        }
        this.realImage.display();
    }//end of method display

}//end of class ProxyImage
