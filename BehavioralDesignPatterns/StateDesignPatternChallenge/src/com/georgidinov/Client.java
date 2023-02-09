package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        AlarmState alarm = new Vibration();
        MobilePhone phone = new MobilePhone(alarm);

        phone.alarmMode();
        phone.alarmMode();

        phone.setState(new Silent());
        phone.alarmMode();
        phone.alarmMode();
        phone.alarmMode();
    }//end of main method

}//end of class Client
