package com.georgidinov;

import java.util.ArrayList;
import java.util.List;

public abstract class ShallowCloneVariation implements Cloneable {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ShallowCloneVariation clone() throws CloneNotSupportedException {
        return (ShallowCloneVariation) super.clone();
    }//end fo method clone

}//end of abstract class ShallowCloneVariation

class MalePerson extends ShallowCloneVariation implements Cloneable {
    private List<String> things;

    public MalePerson(String n, int a) {
        this.things = new ArrayList<>();
        name = n;
        age = a;
        things.add("Testing String For Deep Copy");
    }//end of constructor

    public List<String> getThings() {
        return things;
    }


}//end of class MalePerson

class FeMalePerson extends ShallowCloneVariation implements Cloneable {
    private int[] feMaleThings = {1, 2, 3, 4, 5, 6, 7};

    private Garbage garbage = new Garbage();

    public FeMalePerson(String n, int a) {
        name = n;
        age = a;
    }//end of constructor

    public int[] getFeMaleThings() {
        return feMaleThings;
    }

    public String getGarbageInfo() {
        return this.garbage.getGarbage();
    }

    //deep cloning example
    //clone() on every reference type if there is Has A relationship
    @Override
    public FeMalePerson clone() {
        FeMalePerson clone = null;
        try {
            clone = (FeMalePerson) super.clone();
            clone.feMaleThings = this.feMaleThings.clone();
            clone.garbage = this.garbage.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure in FeMalePerson class!");
            e.printStackTrace();
        }
        return clone;
    }//end of method clone

}//end of class FeMalePerson

class Garbage implements Cloneable {
    private String garbage = "garbage";

    public String getGarbage() {
        return garbage;
    }

    public Garbage clone() throws CloneNotSupportedException {
        return (Garbage) super.clone();
    }
}