package com.georgidinov;

interface Subject {

    //methods to register and unregister observes
    void register(Observer obj);

    void unregister(Observer obj);

    //method to notify observers of change
    void notifyObservers();

    //method to get updates from subject, not required, but ,
    // added so observers can query the subject
    Object getUpdate(Object obj);

}//end of interface Subject
