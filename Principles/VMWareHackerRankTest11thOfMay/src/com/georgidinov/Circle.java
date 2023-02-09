package com.georgidinov;

import com.Shape;

class Circle implements Shape {

    private float radius;

    public Circle(float radius) {
        if (radius > 0 && radius <= 20) {
            this.radius = radius;
        }
    }//end of constructor

    @Override
    public int getArea() {
        return (int) Math.ceil(Math.PI * this.radius * this.radius);
    }//end of method getArea

}//end of class Circle
