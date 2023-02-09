package com.georgidinov;

public class Client {

    public static void main(String[] args) {

        InternetConnection connection = new ConnectionProxy();
        
        try {
            connection.connect("abv.bg");
            connection.connect("gmail.com");
            connection.connect("asd.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//end of main method

}//end of class Client
