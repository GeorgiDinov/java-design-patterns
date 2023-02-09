package com.georgidinov;

import java.util.ArrayList;
import java.util.List;

class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }//end of constructor

    @Override
    public void register(Observer obj) {

        if (obj == null) {
            throw new NullPointerException("Null Observer");
        }
        if (!this.observers.contains(obj)) {
            this.observers.add(obj);
        }

    }//end of method register

    @Override
    public void unregister(Observer obj) {
        this.observers.remove(obj);
    }//end of method unregister

    @Override
    public void notifyObservers() {
        //push operation - the subject sends the changed state through the observers
        List<Observer> observerLocal = null;
        if (!this.changed) {
            return;
        }
        observerLocal = new ArrayList<>(this.observers);
        this.changed = false;
        for (Observer obj : observerLocal) {
            obj.update();
        }

    }//end of method notifyObservers

    @Override
    public Object getUpdate(Object obj) {
        return this.message;
    }//end of method getUpdate

    //method to post message to the topic, change state (trigger notifications)
    public void postMessage(String message) {
        System.out.println("Message Posted To Topic: " + message);
        this.message = message;
        this.changed = true;
        this.notifyObservers();
    }//emd of method postMessage

}//end of class MyTopic