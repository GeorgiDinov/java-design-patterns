package com.georgidinov;

public class Square implements Shape, ManageShapeInterface {

    @Override
    public double area() {
        return 2.0;
    }

    @Override
    public double calculate() {
        return this.area();
    }

}//end of class Square
