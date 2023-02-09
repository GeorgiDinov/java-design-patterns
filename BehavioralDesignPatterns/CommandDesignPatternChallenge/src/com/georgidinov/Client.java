package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        //initializing the receiver
        AbstractStockReceiver receiver = new StockReceiver("Milk", 100);

        //initializing commands
        OrderCommand buyOrder = new BuyCommand(receiver);
        OrderCommand sellOrder = new SellCommand(receiver);

        //initializing the invoker
        BrokerInvoker invoker = new BrokerInvoker();

        //adding commands(orders) to the invoker command(order) list
        invoker.takeOrder(buyOrder);
        invoker.takeOrder(sellOrder);

        //executing all commands from the command list
        //the invoker will call execute on the command object, the command object will redirect
        //the call to the receiver object
        invoker.placeOrder();

    }//end of main method

}//end of class Main
