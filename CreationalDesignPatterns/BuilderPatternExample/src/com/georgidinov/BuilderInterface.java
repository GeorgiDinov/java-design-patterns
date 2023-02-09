package com.georgidinov;

public interface BuilderInterface {
    void buildBody();

    void insertWheels();

    void addHeadLights();

    Product getVehicle();
}//end of interface BuilderInterface


class Car implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car!");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added!");
    }

    @Override
    public void addHeadLights() {
        product.add("2 headlights are added!");
    }

    @Override
    public Product getVehicle() {
        return this.product;
    }
}//end of class Car

class MotorCycle implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a motorcycle!");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added!");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlight is added!");
    }

    @Override
    public Product getVehicle() {
        return this.product;
    }
}//end of class MotorCycle