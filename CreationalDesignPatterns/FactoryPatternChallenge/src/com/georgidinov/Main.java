package com.georgidinov;

import javax.lang.model.util.AbstractAnnotationValueVisitor9;

//Using main for client
public class Main {

    public static void main(String[] args) throws Exception {
        AnimalFactoryInterface animalFactory = new AnimalFactory();

        Animal duck = animalFactory.getAnimalType("duck");
        Animal tiger = animalFactory.getAnimalType("tiger");
        duck.breath();
        tiger.breath();
        Animal exception = animalFactory.getAnimalType("exception");
        exception.breath();

    }//end of main method

}//end of class Main used for client
