package com.georgidinov;

public abstract class AnimalFactoryInterface {
    protected abstract Animal getAnimalType(String animalType) throws Exception;
}
