package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        System.out.println("***Builder Demo***");
        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorCycleBuilder = new MotorCycle();

        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();
        System.out.println();

        director.construct(motorCycleBuilder);
        Product p2 = motorCycleBuilder.getVehicle();
        p2.show();

    }//end of main method

}//end of class Client
