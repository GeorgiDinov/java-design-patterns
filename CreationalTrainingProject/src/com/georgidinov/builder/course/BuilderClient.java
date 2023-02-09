package com.georgidinov.builder.course;

//
//  In this example the whole hierarchy may be confusing at first, but this is with
//purpose, after all "Builder Design Pattern" aims the ease of creating fairly complex and
//large object, by hiding the details and providing simple interface to the client
//
//
//  Our example hierarchy consists of the Item interface which has 3 methods
//Then we have our two abstract classes for Burgers and Drinks which implement the Item
//interface
//We have another interface for Packing
//It's purpose is to have different packing for the Burger and the Drink
//That is why at those abstract classes the getPacking method is overridden
//accordingly
//Pack interface concrete implementations are classes Wrapper(for Burgers) and Bottle(for Drinks)
//Then we have AbstractBurger and AbstractDrink concrete implementations(subclasses)
//which implement the two remaining methods from the Item interface(getName, getPrice)
//with hard cored values(STD outputs)
//---------------------This is pretty much the item hierarchy-------------------------
//
//-----------------------Builder Pattern interfaces and roles-------------------------
//MealBuilder interface with 3 methods buildBurger(), buildDrink() and method that returns
//the newly constructed Meal object getMeal()
//We have two concrete implementations those are RegularMealBuilder and VegetarianMealBuilder
//Both of those classes have Meal object in composition,
//Meal class has a list of Item objects to store it's items, it has methods to print the menu
//and the total cost
//MealBuilder implementations use the Meal object to add the appropriate items according to
//the type of meal vegetarian or regular, then they have getter to the meal,
//so the client can get it
//the Director class has only one method to construct the meal, it takes MealBuilder as parameter
//and call it's build methods
//in our case we have a MealBuilder reference in Director class which we currently don't need
//because we don't have other methods, but it is good practise to have one in future modification
//after director constructs our meal via some of the concrete MealBuilder classes
//the client can get the Meal from the concrete builder with only the getMeal() method
//So we've managed to abstract such a huge object construction behind two method calls
//the construct method of the Director class and getMeal on some of the concrete MealBuilder
//interface implementations
//------------------------------------------------------------------------------------
//
class BuilderClient {

    public static void main(String[] args) {

        System.out.println("\n\t\t<<<Builder Design Pattern>>>\n");

        Director director = new Director();

        MealBuilder vegetarianMealBuilder = new VegetarianMealBuilder();
        director.construct(vegetarianMealBuilder);
        Meal vegetarianMeal = vegetarianMealBuilder.getMeal();
        vegetarianMeal.showMeal();

        MealBuilder regularMealBuilder = new RegularMealBuilder();
        director.construct(regularMealBuilder);
        Meal regularMeal = regularMealBuilder.getMeal();
        regularMeal.showMeal();

    }//end of main method

}//end of class BuilderClient
