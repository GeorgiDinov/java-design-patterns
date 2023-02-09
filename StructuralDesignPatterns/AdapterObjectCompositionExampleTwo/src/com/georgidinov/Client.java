package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        Triangle t = new Triangle(20, 10);
        CalculatorInterface calculatorAdapter = new CalculatorAdapter(t);
        System.out.println("area of the triangle is = " + calculatorAdapter.getArea(null));
    }
}
