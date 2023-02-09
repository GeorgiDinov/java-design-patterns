package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Template Method Design Pattern>>>\n");

        System.out.println("\tProcessing Online Order: ");
        OrderProcessTemplate order = new NetOrder();
        order.processOrder();

        System.out.println("\n\tProcessing In Store Order: ");
        order = new StoreOrder();
        order.processOrder();

    }//end of main method

}//end of class Client
