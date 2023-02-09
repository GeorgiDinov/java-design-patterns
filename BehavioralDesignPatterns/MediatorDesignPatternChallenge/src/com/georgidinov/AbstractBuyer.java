package com.georgidinov;

//this is the "colleague"
abstract class AbstractBuyer {
    protected AuctionMediator mediator;
    protected String name;
    protected double bid;

    public AbstractBuyer(AuctionMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.bid = 0d;
    }//end of constructor

    public String getName() {
        return name;
    }

    public double getBid() {
        return bid;
    }

    public abstract void placeBid(double bidAmount);

    public abstract void cancelBid();

    public abstract void auctionNotification(String message);

}//end of abstract class AbstractBuyer

class Buyer extends AbstractBuyer {

    public Buyer(AuctionMediator mediator, String name) {
        super(mediator, name);
    }//end of constructor


    @Override
    public void placeBid(double bidAmount) {
        this.bid = bidAmount;
    }//end of method placeBid

    @Override
    public void cancelBid() {
        this.bid = 0d;
    }//end of method cancelBid

    @Override
    public void auctionNotification(String message) {
        System.out.println(this.name + " has been notified that " + message);
    }//end of method auctionNotification

}//end of class AuctionBuyer
