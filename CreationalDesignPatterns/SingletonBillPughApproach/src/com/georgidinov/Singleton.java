package com.georgidinov;

public class Singleton {

    private int data;


    private Singleton() {
    }//end of constructor


    public static Singleton getInstance() {
        return SingletonHelper.instance;
    }//end of method getInstance

    private static class SingletonHelper {
        private static final Singleton instance = new Singleton();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}//end of class Singleton
