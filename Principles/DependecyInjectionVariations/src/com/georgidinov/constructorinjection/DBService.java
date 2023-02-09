package com.georgidinov.constructorinjection;

class DBService implements MyService {
    @Override
    public void connect() {
        System.out.println("I am the constructor injected service!");
    }
}
