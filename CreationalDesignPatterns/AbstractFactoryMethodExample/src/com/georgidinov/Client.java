package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
        System.out.println("<<<<<<<<<<<Factory Delimiter>>>>>>>>>");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("red");
        color.fill();
        Color color2 = colorFactory.getColor("green");
        color2.fill();
        Color color3 = colorFactory.getColor("blue");
        color3.fill();
    }//end of main method

}//end of class Client
