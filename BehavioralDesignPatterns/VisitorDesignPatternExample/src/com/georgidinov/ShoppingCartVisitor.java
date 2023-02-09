package com.georgidinov;

interface ShoppingCartVisitor {
    int visit(Book book);

    int visit(Fruit fruit);
}//end of interface ShoppingCartVisitor

class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        //apply $5 discount if book price is greater than $50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN: " +
                book.getIsbnNumber() + " price = " +
                cost);
        return cost;
    }//end of method visit on book

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKilogram() * fruit.getWeight();
        System.out.println(fruit.getName() +
                "'s weight " + fruit.getWeight() + " kg. " +
                " and costs = " + cost);
        return cost;
    }//end of method visit on fruit

}//end of class ShoppingCartVisitorImpl

