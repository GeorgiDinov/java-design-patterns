package com.georgidinov;

//main as a Client
public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        director.construct(vegMealBuilder);
        Meal veganMeal = vegMealBuilder.getMeal();
        veganMeal.showItems();

        System.out.println();

        MealBuilder nonVeganBuilder = new NonVegMealBuilder();
        director.construct(nonVeganBuilder);
        Meal nonVeganMeal = nonVeganBuilder.getMeal();
        nonVeganMeal.showItems();

    }//end of main method

}//end of class Main
