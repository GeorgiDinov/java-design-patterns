package com.georgidinov;

class NetOrder extends OrderProcessTemplate {

    @Override
    protected void doSelect() {
        System.out.println(
                "Item added to online shopping cart" +
                        "\nGet Wrapper Preference" +
                        "\nGet Delivery Address");
    }//end of method doSelect

    @Override
    protected void doPayment() {
        System.out.println("Online Payment Through NetBanking, Credit/Debit card or PayPal.");
    }//end of method doPayment

    @Override
    protected void delivery() {
        System.out.println("Ship the item through post office to the delivery address.");
    }//end of method delivery

    @Override
    protected void giftWrap() {
        System.out.println("Special Birthday Wrap Selected.");
    }//end of method giftWrap

}//end of class NetOrder
