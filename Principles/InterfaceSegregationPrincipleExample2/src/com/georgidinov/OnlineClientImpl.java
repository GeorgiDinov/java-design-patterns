package com.georgidinov;


public class OnlineClientImpl implements RestaurantInterface {

    @Override
    public void acceptOnlineOrder() {
        //place logic
    }

    @Override
    public void takeTelephoneOrder() {
        //not applicable
        throw new UnsupportedOperationException();
    }

    @Override
    public void payOnLine() {
        //place logic
    }

    @Override
    public void walkInCustomerOrder() {
        //not applicable
        throw new UnsupportedOperationException();
    }

    @Override
    public void payInPerson() {
        //not applicable
        throw new UnsupportedOperationException();
    }
}
