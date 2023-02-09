package com.georgidinov;

//Example that has to be improved with the
//State Pattern(replace if/else with state objects)
class TVRemoteBasic {

    private String state = "";

    public void setState(String state) {
        this.state = state;
    }//end of method setState

    public void doAction() {
        if (this.state.equalsIgnoreCase("ON")) {
            System.out.println("TV is turned ON");
        } else if (this.state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }//end of method doAction

    public static void main(String[] args) {

        TVRemoteBasic remote = new TVRemoteBasic();
        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();

    }//end of main method

}//end of class TVRemoteBasic
