package com.georgidinov;

public class VisitorClient {

    public static void main(String[] args) {
        
        MyElement[] elements = new MyElement[]{
                new Book(2d, 2d),
                new Book(1d, 1d),
                new CD(0.75, 0.6d),
                new CD(0.85, 0.6d),
                new DVD(4.5d, 1d),
                new DVD(5.75d, 0.5d)
        };
        USPostageVisitor usPostalVisitor = new USPostageVisitor();
        SouthAmericaPostageVisitor southAmericaPostalVisitor = new SouthAmericaPostageVisitor();
        for (MyElement element : elements) {
            element.accept(usPostalVisitor);
            element.accept(southAmericaPostalVisitor);
        }


        double usTotalCost = usPostalVisitor.getCost();
        double southAmericaCost = southAmericaPostalVisitor.getCost();

        System.out.println("Total price for US shipment = " +
                String.format("%.2f", usTotalCost));
        System.out.println("Total price for South America shipment = " +
                String.format("%.2f", southAmericaCost));

    }//end of main method

}//end of class VisitorClient
