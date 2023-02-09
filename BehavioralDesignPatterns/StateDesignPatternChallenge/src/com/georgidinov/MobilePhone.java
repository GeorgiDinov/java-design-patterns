package com.georgidinov;

class MobilePhone {

    private  AlarmState state;

    public MobilePhone(AlarmState state) {
        this.state = state;
    }//end of constructor

    public void setState(AlarmState state) {
        this.state = state;
    }//end of method setState

    public AlarmState getState() {
        return state;
    }//end of method getState

    public void alarmMode(){
        this.state.alert();
    }

}//end of class MobilePhone
