package com.georgidinov.interfaceinjection;

class SomeService implements MyService {

    @Override
    public void inject(ServiceInterface client) {
        client.setService(this);
    }

    @Override
    public void identify() {
        System.out.println("I am the interface injected service!");
    }

}//end of class SomeService