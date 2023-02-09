package com.georgidinov;

public class Client {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using the template method
        houseType.buildHouse();
        System.out.println("*************");

        houseType = new GlassHouse();
        houseType.buildHouse();

    }//end of main method

}//end of class Client
