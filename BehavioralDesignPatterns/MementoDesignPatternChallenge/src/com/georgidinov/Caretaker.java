package com.georgidinov;

import java.util.LinkedList;


class Caretaker {

    private LinkedList<Object> mementoStack;

    public Caretaker() {
        this.mementoStack = new LinkedList<>();
    }//end of constructor

    public void save(Originator originator) {
        this.mementoStack.addLast(originator.save());
    }//end of method save

    public void restore(Originator originator) {
        if (!mementoStack.isEmpty()) {
            originator.restore(this.mementoStack.removeLast());
        }
    }//end of method restore

    public void restore(Originator originator, int state) {
        if (!mementoStack.isEmpty() && state < this.mementoStack.size()) {
            originator.restore(this.mementoStack.get(state));
        }
    }//end of overloaded restore method


}//end of class Caretaker
