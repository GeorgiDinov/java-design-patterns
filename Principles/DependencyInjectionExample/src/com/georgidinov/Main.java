package com.georgidinov;

public class Main {

    public static void main(String[] args) {
        Service service = new ServiceA();//the injector
        Client client = new Client(service);//injects via the constructor
        client.doSomething();
        client.setMyService(service); //setter injection
        client.doSomething();

    }
}

interface Service {
    void write(String message);
}//end fo interface Service

class ServiceA implements Service {
    @Override
    public void write(String message) {
        System.out.println("Hello world!");
    }
}//end fo class ServiceA

class Client {
    private Service myService;

    //injects via the constructor
    public Client(Service service) {
        this.myService = service;
    }

    public void setMyService(Service myService) {
        this.myService = myService;
    }

    public void doSomething() {
        myService.write("This is a message!");
    }


}//end fo class Client