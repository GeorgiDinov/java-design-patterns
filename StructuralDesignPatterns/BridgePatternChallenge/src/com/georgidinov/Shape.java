package com.georgidinov;

abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }//end of constructor

    protected abstract void drawShape(int borderSize);

    protected abstract void modifyBorder(int borderSize, int multiplier);

}//end of abstract class Shape


class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    protected void drawShape(int borderSize) {
        System.out.print("A Rectangle Is Drawn ");
        color.fillWithColor(borderSize);
    }

    @Override
    protected void modifyBorder(int borderSize, int multiplier) {
        System.out.println("Now we are changing the border length " + multiplier + " times.");
        borderSize*=multiplier;
        drawShape(borderSize);
    }
}//end of class Rectangle

class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    protected void drawShape(int borderSize) {
        System.out.print("A Triangle Is Drawn ");
        color.fillWithColor(borderSize);
    }

    @Override
    protected void modifyBorder(int borderSize, int multiplier) {
        System.out.println("Now we are changing the border length " + multiplier + " times.");
        borderSize *= multiplier;
        drawShape(borderSize);
    }

}//end of class Rectangle
