package com.georgidinov;

import java.util.Random;

public class NewClient {

    public static void main(String[] args) throws Exception {

        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n\t\t\t***Flyweight Pattern Example***\n");

        Robot shape = null;

        //Here we trying to get 3 king type robots
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }
        System.out.println();
        //Here we trying to get 3 queen type robots
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int numberOfDistinctObjectsCreated = myFactory.totalObjectsCreated();
        System.out.println("\nFinal number of Distinct objects created = " + numberOfDistinctObjectsCreated);


    }//end of main method

    private static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }//end of method getRandomColor

}//end of class NewClient
