package com.georgidinov;

import java.util.ArrayList;
import java.util.List;

//the "mediator" between "colleagues"( in this case buyers)
interface AuctionMediator {

    void addBuyer(AbstractBuyer buyer);

    AbstractBuyer auctionWinner();

    void announceAuctionEnd();

}//end of interface AuctionMediator


class Auctioneer implements AuctionMediator {

    private final List<AbstractBuyer> buyers;

    public Auctioneer() {
        this.buyers = new ArrayList<>();
    }//end of constructor

    @Override
    public void addBuyer(AbstractBuyer buyer) {
        this.buyers.add(buyer);
    }

    @Override
    public AbstractBuyer auctionWinner() {
        AbstractBuyer ab = this.buyers.get(0);
        for (int i = 1; i < this.buyers.size(); i++) {
            if (this.buyers.get(i).getBid() > ab.getBid()) {
                ab = this.buyers.get(i);
            }
        }
        return ab;
    }//end of auctionWinner

    @Override
    public void announceAuctionEnd() {
        AbstractBuyer ab = this.auctionWinner();
        String message = "The auction winner is " + ab.getName() +
                " with his bid of $" + String.format("%.2f", ab.getBid()) +
                "\n and the auction is now finished.";
        for (AbstractBuyer buyer : this.buyers) {
            if (buyer != ab) {
                buyer.auctionNotification(message);
            }
        }

    }//end of method announceAuctionEnd

}//end of class Auctioneer