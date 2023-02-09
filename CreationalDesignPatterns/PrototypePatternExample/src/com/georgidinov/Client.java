package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        ShapeCash.loadCash();

        Shape cloneShape = ShapeCash.getShape("1");
        System.out.println("Shape: " + cloneShape.getType());

        Shape cloneShape1 = ShapeCash.getShape("2");
        System.out.println("Shape: " + cloneShape1.getType());

        Shape cloneShape2 = ShapeCash.getShape("3");
        System.out.println("Shape: " + cloneShape2.getType());

    }//end of main method

}//end of class Client
