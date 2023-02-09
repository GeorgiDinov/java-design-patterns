package com.georgidinov.setterinjection;

class DBService implements MyService{
    @Override
    public void connect() {
        System.out.println("I am the setter injected service!");
    }
}
