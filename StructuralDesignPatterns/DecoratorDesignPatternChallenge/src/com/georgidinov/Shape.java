package com.georgidinov;

public interface Shape {
    void draw();
}//end of interface Shape

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle is drawn");
    }
}//end of class Rectangle

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle is drawn");
    }
}//end of class Circle