package com.georgidinov;

public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        System.out.println("Shapes before decoration: ");
        rectangle.draw();
        circle.draw();
        
        System.out.println();

        System.out.println("Shapes after decoration is applied: \n");
        Shape redBorderedRectangle = new BorderColorDecorator(rectangle, "red");
        Shape greenBorderedCircle = new BorderColorDecorator(circle, "green");

        System.out.println("Rectangle with red border:");
        redBorderedRectangle.draw();

        System.out.println();

        System.out.println("Circle with green border:");
        greenBorderedCircle.draw();

    }//end of main method

}//end of class Main
