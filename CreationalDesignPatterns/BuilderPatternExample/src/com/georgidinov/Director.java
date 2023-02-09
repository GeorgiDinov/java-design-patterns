package com.georgidinov;

public class Director {

    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder) {
        this.myBuilder = builder;
        this.myBuilder.buildBody();
        this.myBuilder.insertWheels();
        this.myBuilder.addHeadLights();
    }//end of method construct

}//end of class Director
