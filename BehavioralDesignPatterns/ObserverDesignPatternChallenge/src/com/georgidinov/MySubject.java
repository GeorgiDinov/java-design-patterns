package com.georgidinov;

interface MySubject {

    void register(MyObserver observer);

    void unregister(MyObserver observer);

    void notifyMyObservers();

}//end of interface MySubject
