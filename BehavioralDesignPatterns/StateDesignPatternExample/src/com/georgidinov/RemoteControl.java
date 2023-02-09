package com.georgidinov;

abstract class RemoteControl {
    public abstract void pressSwitch(TV context);

}//end of interface RemoteControl


class On extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On. Going to be Off now!");
        context.setState(new Off());
    }//end of method pressSwitch

}//end of class On

class Off extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already Off. Going to be On now!");
        context.setState(new On());
    }//end of method pressSwitch

}//end of class On