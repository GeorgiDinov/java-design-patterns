package com.georgidinov;


//Example of a "fat" interface:
//it has more than one purpose(violates the single responsibility principle)
//Ordering and Paying
public interface RestaurantInterface {

    void acceptOnlineOrder();

    void takeTelephoneOrder();

    void payOnLine();

    void walkInCustomerOrder();

    void payInPerson();

}//end of interface RestaurantInterface
