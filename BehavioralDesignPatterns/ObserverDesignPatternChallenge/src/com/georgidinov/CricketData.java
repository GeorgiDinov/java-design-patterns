package com.georgidinov;

import java.util.ArrayList;
import java.util.List;

class CricketData implements MySubject {

    private final List<MyObserver> myObservers;
    private boolean changed;
    private int runs;
    private int wickets;
    private double overs;

    public CricketData() {
        this.myObservers = new ArrayList<>();
        this.changed = false;
        this.runs = 0;
        this.wickets = 0;
        this.overs = 0d;
    }//end of constructor

    @Override
    public void register(MyObserver observer) {
        if (observer != null && !this.myObservers.contains(observer)) {
            this.myObservers.add(observer);
            System.out.println(observer.getClass().getSimpleName() + " Is Now SUBSCRIBED");
        }
    }//end of method register

    @Override
    public void unregister(MyObserver observer) {
        if (observer != null) {
            this.myObservers.remove(observer);
            System.out.println(observer.getClass().getSimpleName() + " Is Now UNSUBSCRIBED!");
        }
    }//end of method unregister

    @Override
    public void notifyMyObservers() {
        if (this.changed) {
            this.changed = false;
            List<MyObserver> tempObservers = new ArrayList<>(this.myObservers);
            for (MyObserver observer : tempObservers) {
                observer.update(this.runs, this.wickets, this.overs);
            }
        }
    }//end of method notifyMyObservers

    //triggering the notification
    public void setGameScores(int runs, int wickets, double overs) {
        if (runs >= 0 && wickets >= 0 && overs >= 0) {
            if (this.runs != runs || this.wickets != wickets || this.overs != overs) {
                this.runs = runs;
                this.wickets = wickets;
                this.overs = overs;
                this.changed = true;
                this.notifyMyObservers();
            } else {
                System.out.println("State UNCHANGED passing won't be triggered!");
            }
        }//end of outer if
    }//end of method setGameScores

}//end of class CricketData
