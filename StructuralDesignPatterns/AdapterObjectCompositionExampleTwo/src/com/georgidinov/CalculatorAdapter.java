package com.georgidinov;

public class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle t) {
        this.triangle = t;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();
        Rectangle rec = new Rectangle();

        rec.length = triangle.base;
        rec.width = 0.5 * triangle.height;
        return calculator.getArea(rec);
    }
}
