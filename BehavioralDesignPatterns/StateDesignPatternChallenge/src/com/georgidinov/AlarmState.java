package com.georgidinov;

interface AlarmState {
    void alert();
}//end of interface AlarmState


class Vibration implements AlarmState {
    @Override
    public void alert() {
        System.out.println("vibrating...");
    }
}//end of class Vibration

class Silent implements AlarmState {
    @Override
    public void alert() {
        System.out.println("On Silent...");
    }
}//end of class Silent