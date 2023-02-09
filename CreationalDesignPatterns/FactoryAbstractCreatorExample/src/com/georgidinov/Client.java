package com.georgidinov;

public class Client {

    public static void main(String[] args) {

        Shape shape1 = new RectangleFactory().getShape();
        shape1.draw();

        Shape shape2 = new SquareFactory().getShape();
        shape2.draw();

        Shape shape3 = new CircleFactory().getShape();
        shape3.draw();

    }//end of main method

}//end of class Client
