package com.georgidinov;

class RealPrinter {
    //the "delegate"
    public void print() {
        System.out.println("The Delegate!");
    }
}//end of class RealPrinter

class Printer {
    // the "delegator"
    private RealPrinter realPrinter = new RealPrinter();

    //use the delegate
    public void print() {
        realPrinter.print();
    }
}//end fo class Printer

class Tester {
    //to the outside world it looks like the printer is printing
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }//end of main method

}//end fo class Tester