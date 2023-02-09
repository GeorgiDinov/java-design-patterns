package com.georgidinov.interfaceinjection;

class Main {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Dependency Injection Via Interface Contract>>>\n");

        Client client = new Client();
        MyService myService = new SomeService();
        myService.inject(client);

        client.showServiceCapabilities();

    }//end of main method

}//end fo class main
