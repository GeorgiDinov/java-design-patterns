package com.georgidinov;

public interface Pack {
    String pack();
}//end of interface Pack

class Wrapper implements Pack {
    @Override
    public String pack() {
        return "Wrapper";
    }//end of method getPack
}//end of class Wrapper

class Bottle implements Pack {
    @Override
    public String pack() {
        return "Bottle";
    }//end of method getPack
}//end of class Bottle
