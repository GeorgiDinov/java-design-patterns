package com.georgidinov;

public abstract class BasicCar implements Cloneable {

    protected String model;
    protected String name;
    protected double price = 100d;

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BasicCar clone() {
        BasicCar clone = null;
        try {
            clone = (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Failure... " + e.getMessage());
        }
        return clone;
    }//end of method clone

//    public BasicCar clone() throws CloneNotSupportedException {
//        return (BasicCar) super.clone();
//    }

}//end of abstract class BasicCar


//implement Cloneable in subclasses also,
// if they may have more member variables from the base class
class Nano extends BasicCar implements Cloneable {
    private int test = 25;

    public Nano() {
        this.model = "Cabrio";
        this.name = "Nano";
    }//end of constructor

    public int getTest() {
        return this.test;
    }

    @Override
    public Nano clone() {
        Nano nano = null;
        nano = (Nano) super.clone();
        return nano;
    }//end of overridden clone method

}//end of class Nano

class Ford extends BasicCar {
    public Ford() {
        this.model = "Sedan";
        this.name = "Ford";
    }//end of constructor


}//end of class Ford
