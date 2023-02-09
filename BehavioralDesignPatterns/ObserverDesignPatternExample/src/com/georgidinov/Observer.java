package com.georgidinov;

interface Observer {
    //method to update the observer used by the subject
    void update();

    //attach with subject to observe, not required, but, added so that the observer can
    //query the subject to see if an update has occured
    void setSubject(Subject obj);

}//end of interface Observer


