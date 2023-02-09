package com.georgidinov;

public class Client {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PayPalStrategy("test@gmail.com", "password", "1"));
        shoppingCart.pay(new CreditCardStrategy("Test Test", "1234-4567-1234", "111", "12/2025"));

    }//end of main method

}//end of class Client
