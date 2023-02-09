package com.georgidinov;

public class Director {

    private MealBuilder mealBuilder;

    public void construct(MealBuilder builder) {
        this.mealBuilder = builder;
        this.mealBuilder.buildBurger();
        this.mealBuilder.buildDrink();
    }//end of method construct

}//end of class Director
