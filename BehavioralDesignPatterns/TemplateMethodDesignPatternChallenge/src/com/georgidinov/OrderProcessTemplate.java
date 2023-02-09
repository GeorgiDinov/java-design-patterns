package com.georgidinov;

abstract class OrderProcessTemplate {

    //template method
    public final void processOrder() {
        this.doSelect();
        this.doPayment();
        this.giftWrap();
        this.delivery();
    }//end of method processOrder

    protected abstract void doSelect();

    protected abstract void doPayment();

    protected abstract void delivery();

    protected void giftWrap() {
        System.out.println("Item Is In It's Original Packing.");
    }//end of method giftWrap

}//end of abstract class OrderProcessTemplate
