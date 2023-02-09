package com.georgidinov;

import java.nio.file.FileAlreadyExistsException;

//Using class Main as a client class
public class Main {

    public static void main(String[] args) {
        //AbstractFactory.getFactory("hollywood");
        AbstractFactory hollyWoodFactory = FactoryProducer.getFactory("hollywood");
        HollyWoodMovies hollyWoodAction = hollyWoodFactory.getHollyWoodMovie("action");
        hollyWoodAction.getName();
        HollyWoodMovies hollyWoodComedy = hollyWoodFactory.getHollyWoodMovie("comedy");
        hollyWoodComedy.getName();

        AbstractFactory bullyWoodFactory = FactoryProducer.getFactory("bullywood");
        BullyWoodMovies bullyAction = bullyWoodFactory.getBullyWoodMovie("action");
        bullyAction.getName();
        BullyWoodMovies bullyComedy = bullyWoodFactory.getBullyWoodMovie("comedy");
        bullyComedy.getName();
    }//end of main method

}//end of class Main
