package com.georgidinov;

class Calculator {

    public void calculate(int a, int b, MathematicalOperationStrategy strategy) {
        strategy.performOperation(a, b);
    }//end fo method calculate

}//end of class Calculator
