package com.georgidinov;

//this is going to be the "colleague"
abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }//end of constructor

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);

}//end of abstract class User

class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }//end of constructor

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sends message {" + message + "}");
        this.mediator.sendMessage(message, this);
    }//end of method sendMessage

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received message {" + message + "}");
    }//end of method receiveMessage

}//end of class UserImpl
