package com.georgidinov;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        System.out.println(vehicle.getSpeed());
        vehicle = new Car();
        System.out.println(vehicle.getCubicCapacity());
    }
}
