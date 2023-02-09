package com.georgidinov;

public class Client {

    private MyErrorHandler handler;

    public Client() {
        this.handler = new FaxErrorHandler();
        this.handler.setNextInChain(new EmailErrorHandler());
    }//end of constructor

    public static void main(String[] args) {
        Client client = new Client();
        IssueRaiser issueRaiser = new IssueRaiser(client.handler);
        issueRaiser.raiseMessage(new Message("Fax is reaching late to the destination", MessagePriority.NORMAL));
        issueRaiser.raiseMessage(new Message("Email is not going", MessagePriority.HIGH));
        issueRaiser.raiseMessage(new Message("In Email, BCC is disabled occasionally", MessagePriority.NORMAL));
        issueRaiser.raiseMessage(new Message("Fax is not reaching destination", MessagePriority.HIGH));

        //won't be processed,  and the client won't know
        //TODO: 4/30/2020 exception throw or message returned
        issueRaiser.raiseMessage(new Message("Testing for not implemented solution", MessagePriority.HIGH));


    }//end of main method

}//end of class Client
