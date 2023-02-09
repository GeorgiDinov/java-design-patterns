package com.georgidinov;

public abstract class Vehicle {

    abstract int getSpeed();

    abstract int getCubicCapacity();

}//end of class Vehicle


class Car extends Vehicle {
    @Override
    int getSpeed() {
        return -1;
    }

    @Override
    int getCubicCapacity() {
        return -1;
    }

    boolean isHatchBack() {
        return true;
    }
}//end fo class Car

class Bus extends Vehicle {

    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    String getEmergencyExitLocation() {
        return "Run!";
    }

}//end fo class Bus

