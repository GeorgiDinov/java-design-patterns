package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        //create Subject
        MyTopic topic = new MyTopic();

        //create observers
        Observer observer1 = new MyTopicSubscriber("Observer1");
        Observer observer2 = new MyTopicSubscriber("Observer2");
        Observer observer3 = new MyTopicSubscriber("Observer3");

        //register observers, we could have added registration as part of observer
        //constructor
        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        //attach observer to subject(not required,could have passed in state to update method
        //
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        //check if any update is available, not required
        observer1.update();

        //now send message to subject, trigger notifyAll
        topic.postMessage("New Message");


    }//end of main method

}//end of class Main
