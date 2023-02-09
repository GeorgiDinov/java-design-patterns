package com.georgidinov;

interface MathematicalOperationStrategy {
    void performOperation(int a, int b);
}//end of interface MathematicalOperationStrategy


class Addition implements MathematicalOperationStrategy {

    @Override
    public void performOperation(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }//end of method performOperation

}//end of class Addition

class Subtraction implements MathematicalOperationStrategy {

    @Override
    public void performOperation(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }//end of method performOperation

}//end of class Subtraction

class Multiplication implements MathematicalOperationStrategy {

    @Override
    public void performOperation(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }//end of method performOperation

}//end of class Multiplication