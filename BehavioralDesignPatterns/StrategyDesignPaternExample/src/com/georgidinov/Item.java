package com.georgidinov;

//helper for the context
class Item {

    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }//end of constructor


    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}//end of class Item
