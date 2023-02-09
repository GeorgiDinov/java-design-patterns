package com.georgidinov;

import java.util.Scanner;

public class Client {
    private DispenseChain c1;

    public Client() {
        //initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        //set the chain of responsibility
        c1.setNext(c2);
        c2.setNext(c3);
    }//end of constructor

    public static void main(String[] args) {
        Client atmDispenser = new Client();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense: ");
            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiples of 10!");
                return;
            }
            //process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }//end of while loop

    }//end of main method


}//end of class Client
