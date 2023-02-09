package com.georgidinov;

abstract class AbstractStockReceiver {

    protected String name;
    protected int quantity;

    public AbstractStockReceiver(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    protected abstract void buy();

    protected abstract void sell();

}//end of interface StockReceiver


class StockReceiver extends AbstractStockReceiver {

    public StockReceiver(String name, int quantity) {
        super(name, quantity);
    }//end of constructor

    @Override
    public void buy() {
        System.out.println("Buying " + this.name +
                ", quantity available " + this.quantity + " pcs.");
    }//end of method buy

    @Override
    public void sell() {
        System.out.println("Selling " + this.name +
                ", quantity available " + this.quantity + " pcs.");
    }//end of method sell

}//end of class StockReceiver