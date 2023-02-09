package com.georgidinov.setterinjection;

class Client {

    private MyService service;

    public void setService(MyService service) {
        this.service = service;
    }


    public void showServiceCapabilities() {
        this.service.connect();
    }
}
