package com.georgidinov;

public class CaptainsSingleton {

    private boolean isCaptain;

    private CaptainsSingleton() {
    }//end of constructor

    public static CaptainsSingleton getInstance() {
        return CaptainsSingletonHelper.instance;
    }//end of method getInstance

    private static class CaptainsSingletonHelper {
        private static final CaptainsSingleton instance = new CaptainsSingleton();
    }//end of class CaptainsSingletonHelper

    public boolean isCaptain() {
        return isCaptain;
    }
    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

}//end of class CaptainSingleton
