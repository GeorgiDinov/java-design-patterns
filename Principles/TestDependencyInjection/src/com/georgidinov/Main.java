package com.georgidinov;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Client {
    private ExampleService service;

    Client() {
        //specify a specific implementation in the constructor instead of using
        //dependency injection
        service = new ExampleService();
    }

    public String greet() {
        return "Hello " + service.getName();
    }
}

class ExampleService {
    String name;

    public String getName() {
        return name;
    }
}

