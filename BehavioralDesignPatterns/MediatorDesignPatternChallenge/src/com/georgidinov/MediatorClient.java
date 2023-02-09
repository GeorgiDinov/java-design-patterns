package com.georgidinov;

public class MediatorClient {

    public static void main(String[] args) {
        AuctionMediator mediator = new Auctioneer();
        AbstractBuyer buyer1 = new Buyer(mediator, "John Smith");
        AbstractBuyer buyer2 = new Buyer(mediator, "Jason Born");
        AbstractBuyer buyer3 = new Buyer(mediator, "Michael Jordan");
        AbstractBuyer buyer4 = new Buyer(mediator, "Steve Blue");

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);
        mediator.addBuyer(buyer4);

        buyer1.placeBid(100.00);
        buyer2.placeBid(120.00);
        buyer3.placeBid(45.00);
        buyer4.placeBid(96.00);

        System.out.println("\n" + mediator.auctionWinner().getName() +
                " Wins The auction With His Highest Bid Of $" +
                mediator.auctionWinner().getBid() + "\n");

        mediator.announceAuctionEnd();
        System.out.println("\n" + buyer2.getName() + " has canceled his bid!\n");
        buyer2.cancelBid();

        System.out.println("\n" + mediator.auctionWinner().getName() +
                " Wins The auction With His Highest Bid Of $" +
                mediator.auctionWinner().getBid() + "\n");

        mediator.announceAuctionEnd();

    }//end of main method

}//end of class MediatorClient
