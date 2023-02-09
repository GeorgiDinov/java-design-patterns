package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Bridge Design Pattern>>>\n");

        Shape triangle = new Triangle(new Green());
        triangle.drawShape(20);
        triangle.modifyBorder(20,3);

        System.out.println("\t\t\t********");

        Shape rectangle = new Rectangle(new Red());
        rectangle.drawShape(50);
        rectangle.modifyBorder(50,2);

    }//end of main method

}//end of class Main
