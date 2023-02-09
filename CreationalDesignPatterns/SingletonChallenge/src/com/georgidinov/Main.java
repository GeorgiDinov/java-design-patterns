package com.georgidinov;


public class Main {

    public static void main(String[] args) {

        CaptainsSingleton singleton = CaptainsSingleton.getInstance();
        singleton.setCaptain(true);
        System.out.println("First instance = " + singleton);
        System.out.println("First instance isCaptain = " + singleton.isCaptain());

        singleton = null;
        System.out.println("\nFirst instance null out check = " + singleton + "\n");

        singleton = CaptainsSingleton.getInstance();
        //singleton.setCaptain(true);
        System.out.println("Second instance = " + singleton);
        System.out.println("Second instance isCaptain = " + singleton.isCaptain());

        CaptainsSingleton s2 = CaptainsSingleton.getInstance();
        System.out.println(singleton==s2);

    }//end of main method

}//end of class Main
