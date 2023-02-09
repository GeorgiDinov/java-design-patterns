package com.georgidinov;

public class AnimalFactory extends AnimalFactoryInterface {

    @Override
    public Animal getAnimalType(String animalType) throws Exception {
        if (animalType == null) {
            return null;
        } else if (animalType.equalsIgnoreCase("TIGER")) {
            return new Tiger();
        } else if (animalType.equalsIgnoreCase("DUCK")) {
            return new Duck();
        }
        throw new Exception("Animal type not supported!");
    }//end of method getAnimalType

}//end of class AnimalFactory
