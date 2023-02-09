package com.georgidinov;

import javax.lang.model.type.MirroredTypeException;

public interface MealBuilder {
    void buildBurger();

    void buildDrink();

    Meal getMeal();
}//end of interface MealBuilder

class VegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
}//end of VegMealBuilder

class NonVegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new Burger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}//end of class NonVegMealBuilder
