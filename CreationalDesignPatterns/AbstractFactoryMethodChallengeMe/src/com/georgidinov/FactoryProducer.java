package com.georgidinov;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory == null) {
            return null;
        } else if (factory.equalsIgnoreCase("hollywood")) {
            return new HollyWoodMovieFactory();
        } else if (factory.equalsIgnoreCase("bullywood")) {
            return new BullyWoodMovieFactory();
        }
        return null;
    }//end of method getFactory

}//end of class FactoryProducer
