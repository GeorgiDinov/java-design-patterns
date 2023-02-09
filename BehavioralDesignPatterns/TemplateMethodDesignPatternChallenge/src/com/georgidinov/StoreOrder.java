package com.georgidinov;

class StoreOrder extends OrderProcessTemplate {

    @Override
    protected void doSelect() {
        System.out.println("Customer chooses item from shelf.");
    }//end of method doSelect

    @Override
    protected void doPayment() {
        System.out.println("Pay at counter through cash/POS.");
    }//end of method doPayment

    @Override
    protected void delivery() {
        System.out.println("Item delivered at the delivery counter.");
    }//end of method delivery

}//end of class StoreOrder
