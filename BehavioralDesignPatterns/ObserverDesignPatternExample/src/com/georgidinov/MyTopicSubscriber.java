package com.georgidinov;

class MyTopicSubscriber implements Observer {

    //not required, we could just pass subject's state to update method
    //but, also used to attach
    private Subject topic;
    private String name;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }//end of constructor

    @Override
    public void update() {
        //this method could take data of subject state that was changed, do need to ask
        //the topic for it (poll operation - the observer retrieves the state)
        String msg = (String) this.topic.getUpdate(this);
        if (msg == null) {
            System.out.println(this.name + ":: No New Message");
        } else {
            System.out.println(this.name + "Consuming Message " + msg);
        }
    }//end of method update

    @Override
    public void setSubject(Subject obj) {
        this.topic = obj;
    }//end of method setSubject

}//end of class MyTopicSubscriber
