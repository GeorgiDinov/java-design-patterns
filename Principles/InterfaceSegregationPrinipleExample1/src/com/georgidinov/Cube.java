package com.georgidinov;

public class Cube implements Shape, SolidShape, ManageShapeInterface {

    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double volume() {
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }

}//end of class Cube
