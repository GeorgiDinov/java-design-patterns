package com.georgidinov;

interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}//end of interface ItemElement

class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }//end of constructor

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
       return visitor.visit(this);
    }//end of method accept

}//end of class Book

class Fruit implements ItemElement{

    private int pricePerKilogram;
    private int weight;
    private String name;

    public Fruit(int pricePerKilogram, int weight, String name) {
        this.pricePerKilogram = pricePerKilogram;
        this.weight = weight;
        this.name = name;
    }//end of constructor

    public int getPricePerKilogram() {
        return pricePerKilogram;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }//end of method accept

}//end of class fruit
