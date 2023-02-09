package com.georgidinov;

interface OrderCommand {
    void execute();
}//end of interface OrderCommand

class BuyCommand implements OrderCommand {
    private AbstractStockReceiver receiver;

    public BuyCommand(AbstractStockReceiver receiver) {
        this.receiver = receiver;
    }//end of constructor

    @Override
    public void execute() {
        this.receiver.buy();
    }//end of method execute

}//end of class BuyCommand

class SellCommand implements OrderCommand {
    private AbstractStockReceiver receiver;

    public SellCommand(AbstractStockReceiver receiver) {
        this.receiver = receiver;
    }//end of constructor

    @Override
    public void execute() {
        this.receiver.sell();
    }//end of method execute

}//end of class SellCommand



