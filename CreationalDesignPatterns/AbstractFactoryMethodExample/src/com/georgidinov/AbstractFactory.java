package com.georgidinov;


public abstract class AbstractFactory {

    protected abstract Color getColor(String color);

    protected abstract Shape getShape(String shape);

}//end of class AbstractFactory


class ShapeFactory extends AbstractFactory {
    @Override
    protected Color getColor(String color) {
        return null;
    }

    @Override
    protected Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }//end of method getShape

}//end of class ShapeFactory


class ColorFactory extends AbstractFactory {
    @Override
    protected Color getColor(String color) {
        if (color == null) {
            return null;
        } else if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }//end of method getColor

    @Override
    protected Shape getShape(String shape) {
        return null;
    }
}//end of class ColorFactory
