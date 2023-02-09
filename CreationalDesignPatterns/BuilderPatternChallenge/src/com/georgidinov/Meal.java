package com.georgidinov;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }//end of constructor

    public void addItem(Item item) {
        this.items.add(item);
    }//end of method addItem

    private double getTotalCost() {
        return this.items.stream().mapToDouble(Item::getPrice).sum();
    }//end of method getTotalCost

    public void showItems() {
        System.out.println("Meal Items: ");
        for (Item item : this.items) {
            System.out.println(item.getName() + " price = " +
                    item.getPrice() +
                    " packed in " + item.getPackIng());
        }
        System.out.println("Total price: " + this.getTotalCost());
        System.out.println("**************");
    }//end of method showItems

}//end of class Meal
