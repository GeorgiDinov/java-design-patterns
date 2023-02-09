package com.georgidinov;

import com.Shape;

class Square implements Shape {

    private float width;

    public Square(float width) {
        if (width > 0 && width <= 20) {
            this.width = width;
        }
    }//end of constructor

    @Override
    public int getArea() {
        return (int) Math.ceil(this.width * this.width);
    }//end fo method getArea

}//end of class Square
