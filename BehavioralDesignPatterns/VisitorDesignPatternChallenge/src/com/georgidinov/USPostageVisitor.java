package com.georgidinov;

class USPostageVisitor implements MyVisitor {

    private double cost = 0d;

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
        if (this.cost > 20) {
            return 0d;
        } else {
            return this.cost;
        }
    }//end of method  getCost

}//end of class USPostageVisitor
