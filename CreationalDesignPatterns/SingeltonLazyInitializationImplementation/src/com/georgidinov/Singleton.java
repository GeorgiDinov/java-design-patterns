package com.georgidinov;

public class Singleton {

    private int data = 0;
    //double check locking use the volatile keyword and sync on the class
    //after the null check
    private volatile static Singleton uniqueInstance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {//for the double check locking
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

}//end of class Singleton
