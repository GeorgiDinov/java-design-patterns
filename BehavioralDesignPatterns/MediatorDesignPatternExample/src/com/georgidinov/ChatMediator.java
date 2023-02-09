package com.georgidinov;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);

}//end of interface ChatMediator

class ChatMediatorImpl implements ChatMediator {
    private final List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }//end of constructor

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receiveMessage(message);
            }
        }//end of for loop

    }//end of method sendMessage

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }//end of method addUser

}//end of class ChatMediatorImpl
