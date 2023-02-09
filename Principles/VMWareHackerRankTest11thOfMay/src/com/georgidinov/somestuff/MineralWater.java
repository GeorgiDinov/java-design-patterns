package com.georgidinov.somestuff;

//        Jimmy is a truck driver who delivers mineral water.
//        He loads the water from a warehouse and distributes it within many stores in the town.
//        Sometimes when Jimmy goes to the warehouse there is not enough water to full the truck which makes him angry.
//        He wants to go for delivery only if the truck is full.
//        You can help him if you write a program that checks if it is possible to load the whole truck.
//        The mineral water is available in two types of bottles - 1 liter and 5 liters.
//        Jimmy always tries to load as much of the big bottles first and then adds small bottles.
//        Given the capacity of the truck and the available bottles in the warehouse you should calculate
//        the number of small bottles that he will load. If there are not enough small bottles the result should be -1.

//        Input
//        Read from the standard input:
//        The number of small bottles in the warehouse - integer number
//        The number of big bottles in the warehouse - integer number
//        The capacity of the truck - integer number

//        Output
//        Print to the standard output:
//        One line of output:
//        the number of small bottles he will deliver.
//        -1 if not possible to fill completely the truck.
//        Sample Tests
//        Input
//        3
//        1
//        8
//        Output
//        3
//        Input
//        3
//        1
//        9
//        Output
//        -1
//        Explanation
//        He can load 9 liters in the truck. If he gets 1 big bottle and 3 small bottles,
//        he will have 8 liters and space for 1 more, so he will not make a delivery.

import java.util.Scanner;

public class MineralWater {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int result = calculateSmallBottlesNumber(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Result = " + result);
    }//end of main method


    private static int[] readInput() {

        int[] result = new int[3];
        for (int i = 0; i < result.length; i++) {
            //System.out.print("Enter an integer number: ");
            if (scanner.hasNextInt()) {
                result[i] = scanner.nextInt();
            } else {
                //System.out.println("Please enter an integer value!");
                i--;
            }
            scanner.nextLine();
        }
        return result;

    }//end of method readInput

    private static int calculateSmallBottlesNumber(int i, int j, int k) {
        int fiveLitre = j * 5;
        int spaceAvailable = k % fiveLitre;
        if (i >= spaceAvailable) {
            return spaceAvailable;
        } else {
            return -1;
        }
    }//end of method calculateSmallBottlesNumber

}//end of class MineralWater
