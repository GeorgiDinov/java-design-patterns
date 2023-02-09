package com.georgidinov;

public class Client {

    public static void main(String[] args) throws Exception {

        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");

        RobotInterface shape = myFactory.getRobotFromFactory("small");
        shape.print();

        //Trying to get the object additional 2 more times
        //Note that from now onward we don't need to create additional
        //small robots as we already have created this category
        for (int i = 0; i < 2; i++) {
            shape = myFactory.getRobotFromFactory("small");
            shape.print();
        }

        int numberOfDistinctObjects = myFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now = " + numberOfDistinctObjects);

        //Here we are trying to get the objects 5 times
        //Note that the second time onward we don't need to create
        //additional large robots as we already have created this category
        //in the first attempt (at i == 0)
        for (int i = 0; i < 5; i++) {
            shape = myFactory.getRobotFromFactory("large");
            shape.print();
        }
        numberOfDistinctObjects = myFactory.totalObjectsCreated();
        System.out.println("\nFinal number of Distinct Robot objects  created = " + numberOfDistinctObjects);

    }//end of main method

}//end of class Client
