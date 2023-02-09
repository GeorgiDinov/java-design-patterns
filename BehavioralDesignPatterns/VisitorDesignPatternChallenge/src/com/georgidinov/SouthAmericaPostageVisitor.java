package com.georgidinov;

class SouthAmericaPostageVisitor implements MyVisitor {

    private double cost;

    @Override
    public void visit(Book book) {
        this.cost += (book.getWeight() * 2);
    }//end of method visit on book

    @Override
    public void visit(CD cd) {
        this.cost += (cd.getWeight() * 2.5d);
    }//end of method visit on cd

    @Override
    public void visit(DVD dvd) {
        this.cost += (dvd.getWeight() * 3d);
    }//end of method visit on dvd

    public double getCost() {
        this.cost *= 2;
        if (this.cost > 30) {
            return 0d;
        } else {
            return this.cost;
        }
    }//end of method  getCost

}//end of class SouthAmericaPostageVisitor
