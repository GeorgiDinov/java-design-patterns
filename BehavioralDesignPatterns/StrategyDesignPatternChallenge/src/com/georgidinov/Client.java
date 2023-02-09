package com.georgidinov;

public class Client {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.calculate(10, 5, new Addition());
        calculator.calculate(10, 5, new Subtraction());
        calculator.calculate(10, 5, new Multiplication());

    }//end of main method

}//end of class Client
