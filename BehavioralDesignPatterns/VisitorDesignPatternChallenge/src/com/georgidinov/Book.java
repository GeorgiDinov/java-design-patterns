package com.georgidinov;

class Book implements MyElement {
    private final double price;
    private final double weight;

    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }//end of constructor

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }//end of method accept

}//end of class Book