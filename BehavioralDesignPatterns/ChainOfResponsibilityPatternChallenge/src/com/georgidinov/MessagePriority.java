package com.georgidinov;

import java.util.Hashtable;

enum MessagePriority {

    HIGH("High Priority"), NORMAL("Normal Priority");

    private final String priority;

    MessagePriority(String priority) {
        this.priority = priority;
    }//end of constructor

    public String getPriority() {
        return priority;
    }

}//end of enum MessagePriority

class Message {
    private String text;
    private MessagePriority errorPriority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.errorPriority = priority;
    }//end of constructor

    public String getText() {
        return text;
    }

    public String getErrorPriority() {
        return errorPriority.getPriority();
    }

}//end of class Message