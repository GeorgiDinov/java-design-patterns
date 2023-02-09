package com.georgidinov;

public abstract class Shape implements Cloneable {
    protected String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return this.type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }//end of method clone

}//end of abstract class Shape


class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }//end of constructor

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }//end of method draw

}//end of class Rectangle


class Square extends Shape {

    public Square() {
        type = "Square";
    }//end of constructor

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }//end of method draw

}//end of class Square


class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }//end of constructor

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }//end of method draw

}//end of class Circle

















