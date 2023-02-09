package com.georgidinov;

class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("someFileName.jpg");

        image.display();
        System.out.println();

        image.display();

    }//end of main method

}//end of class Main
