package com.georgidinov;

import java.util.LinkedList;

class BrokerInvoker {

    private LinkedList<OrderCommand> orders;

    public BrokerInvoker() {
        this.orders = new LinkedList<>();
    }//end of constructor

    public void takeOrder(OrderCommand order) {
        this.orders.addLast(order);
    }//end of method takeOrder

    public void placeOrder() {
        for (OrderCommand order : this.orders) {
            order.execute();
        }
        this.orders.clear();
    }//end of method place order

}//end of class BrokerInvoker
