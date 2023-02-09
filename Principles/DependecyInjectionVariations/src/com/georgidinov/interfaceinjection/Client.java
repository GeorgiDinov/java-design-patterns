package com.georgidinov.interfaceinjection;

class Client implements ServiceInterface {

    private MyService myService;

    @Override
    public void setService(MyService service) {
        this.myService = service;
    }

    public void showServiceCapabilities() {
        this.myService.identify();
    }

}//end of class Client
