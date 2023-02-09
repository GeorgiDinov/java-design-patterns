package com.georgidinov;

import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }//end of constructor

    public void add(String part) {
        this.parts.addLast(part);
    }//end of method add

    public void show() {
        System.out.println("\nProduct completed as bellow: ");
        for (int i = 0; i < this.parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }//end of method show

}//end of class Product
