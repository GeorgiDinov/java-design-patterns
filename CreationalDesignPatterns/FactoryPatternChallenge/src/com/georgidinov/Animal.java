package com.georgidinov;

public abstract class Animal {

    protected abstract void breath();

}//end of abstract class Animal


class Duck extends Animal {
    @Override
    protected void breath() {
        System.out.println("Duck is breathing...");
    }
}//end of class Duck

class Tiger extends Animal {
    @Override
    protected void breath() {
        System.out.println("Tiger is breathing...");
    }
}//end of class Tiger