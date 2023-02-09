package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        System.out.println("Decorator Design Pattern");
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorExampleOne cd1 = new ConcreteDecoratorExampleOne();
        //decorating concrete component object with concrete decorator ex.1
        cd1.setTheComponent(cc);
        cd1.doJob();

        System.out.println();
        ConcreteDecoratorExampleTwo cd2 = new ConcreteDecoratorExampleTwo();
        //Decorating ConcreteComponent object cc
        //with ConcreteDecorator1 and ConcreteDecorator2
        cd2.setTheComponent(cd1);
        cd2.doJob();
    }
}
