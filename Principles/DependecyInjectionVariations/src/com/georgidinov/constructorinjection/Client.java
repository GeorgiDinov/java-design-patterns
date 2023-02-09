package com.georgidinov.constructorinjection;

class Client {

    private MyService service;

    public Client(MyService service) {
        this.service = service;
    }


    public void showServiceCapabilities() {
        this.service.connect();
    }
}
