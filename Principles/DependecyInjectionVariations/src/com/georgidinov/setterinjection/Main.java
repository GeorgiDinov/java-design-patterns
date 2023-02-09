package com.georgidinov.setterinjection;

class Main {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Dependency Injection Via Setter>>>\n");
        Client client = new Client();
        MyService service = new DBService();
        client.setService(service);
        client.showServiceCapabilities();
    }
}
