package com.georgidinov;

public class Main {

    public static void main(String[] args) {// throws CloneNotSupportedException {
        BasicCar nano = CarCash.getCashedCar("Nano");
        System.out.println("Car: " + nano.getName() +
                " model: " + nano.getModel() + " price: " + nano.getPrice());

        BasicCar ford = CarCash.getCashedCar("Ford");
        System.out.println("Car: " + ford.getName() +
                " model: " + ford.getModel() + " price: " + ford.getPrice());

        Nano nano1 = (Nano) nano.clone();
        System.out.println("test value = " + nano1.getTest());

    }//end of main method

}//end of class Main
