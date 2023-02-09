package com.georgidinov;

interface PaymentStrategy {
    void pay(int amount);
}//end of interface PaymentStrategy


class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }//end of constructor

    @Override
    public void pay(int amount) {
        System.out.println(amount + " payed with credit/debit card");
    }//end of method pay

}//end of class CreditCardStrategy

class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String id;
    private String password;

    public PayPalStrategy(String email, String id, String password) {
        this.email = email;
        this.id = id;
        this.password = password;
    }//end of constructor

    @Override
    public void pay(int amount) {
        System.out.println(amount + " payed with PayPal");
    }//end of method pay

}//end of class PayPalStrategy