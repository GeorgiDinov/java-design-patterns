package com.georgidinov;

import java.util.Random;

public class CounterStrike {

    public static void main(String[] args) throws Exception {

        System.out.println("\n\t\t\t<<<Flyweight Design Pattern>>>\n");

        PlayerFactory factory = new PlayerFactory();
        Player player;

        //creating random player objects and assigning random weapons
        for (int i = 0; i < 12; i++) {
            player = factory.getPlayer(randomPlayer());
            player.assignWeapon(randomWeapon());
            player.mission();
        }//end of for loop

        int numberOfObjects = factory.getNumberOfPlayersCreated();
        System.out.println("\nNumber of Distinct Player objects created = " + numberOfObjects);

    }//end of main method

    private static String randomPlayer() {
        Random random = new Random();
        int number = random.nextInt(20);
        if (number % 2 == 0) {
            return "Terrorist";
        } else {
            return "CounterTerrorist";
        }
    }//end of method randomType

    private static String randomWeapon() {
        Random random = new Random();
        String[] weapons = {
                "AK-47",
                "M-16",
                "Desert Eagle",
                "Gut Knife",
                "M-4",
                "AR-15",
                "AK-74",
                "Glock-17",
                "TT",
                "RPG",
                "MP-5"
        };

        return weapons[random.nextInt(weapons.length)];

    }//end of method produceRandomWeapon

}//end of class CounterStrike
