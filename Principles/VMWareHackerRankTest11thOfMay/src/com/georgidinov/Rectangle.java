package com.georgidinov;

import com.Shape;

class Rectangle implements Shape {

    private float width;
    private float height;

    public Rectangle(float width, float height) {
        if (width > 0 && width <= 20) {
            this.width = width;
        }
        if (height > 0 && width <= 20) {
            this.height = height;
        }
    }//end of constructor

    @Override
    public int getArea() {
        return (int) Math.ceil(this.width * this.height);
    }//end of method getArea

}//end of class Rectangle
