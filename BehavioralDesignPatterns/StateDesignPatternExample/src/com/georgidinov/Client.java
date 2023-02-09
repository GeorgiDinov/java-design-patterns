package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<State Design Pattern>>>\n");

        //initially TV is off
       Off initialState = new Off();

       TV tv = new TV(initialState);

       //first time pressed
       tv.pressButton();

       //second time pressed
       tv.pressButton();


    }//end of main method

}//end of class Client
