package com.georgidinov;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }//end of constructor

    public void addItem(Item item) {
        this.items.add(item);
    }//end of method addItem

    public void removeItem(Item item) {
        this.items.remove(item);
    }//end of method removeItem

    public int calculateTotal() {
        return this.items.stream().mapToInt(Item::getPrice).sum();
    }//end of method calculateTotal

    public void pay(PaymentStrategy paymentMethod) {
        int amount = this.calculateTotal();
        paymentMethod.pay(amount);
    }//end fo method pay


}//end of class ShoppingCart
