package com.georgidinov;

abstract class WorkShop {
    public abstract void work();
}//end of abstract class WorkShop

class Produce extends WorkShop {
    @Override
    public void work() {
        System.out.println("Produced!");
    }
}//end of class Produce

class Assemble extends WorkShop {
    @Override
    public void work() {
        System.out.println("And Assembled!");
    }
}//end of class Assemble