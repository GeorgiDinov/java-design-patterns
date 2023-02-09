package com.georgidinov.constructorinjection;

class Main {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Dependency Injection Via Setter>>>\n");
        MyService service = new DBService();
        Client client = new Client(service);
        client.showServiceCapabilities();
    }
}
