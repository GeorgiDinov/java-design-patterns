package com.georgidinov.prototype.course;


abstract class AbstractCar implements Cloneable {

    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public AbstractCar clone() throws CloneNotSupportedException {
        return (AbstractCar) super.clone();
    }//end of clone method

}//end of abstract class AbstractCar



class Ford extends AbstractCar {

    private int testVariable = 100;

    public Ford(String fordName, double fordPrice) {
        name = fordName;
        price = fordPrice;
    }//end of constructor

    @Override
    public Ford clone() {
        Ford clone = null;
        try {
            clone = (Ford) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;

    }//end of method clone

    public int getTestVariable() {
        return testVariable;
    }

}//end of class Ford

class Audi extends AbstractCar {
    public Audi(String audiName, double audiPrice) {
        name = audiName;
        price = audiPrice;
    }
}//end of class Audi
