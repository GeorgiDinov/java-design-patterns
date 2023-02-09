package com.georgidinov;

interface RobotInterface {
    
    void print();

    //extrinsic data passed as arguments
    void setColor(String colorOfRobot);

}//end of interface RobotInterface


class Robot implements RobotInterface {

    private final String robotType;
    private String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        System.out.println("This is a " + this.robotType +
                " type robot with " + this.colorOfRobot + " color.");
    }//end of method print

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }//end of method setColor

}//end of class Robot


//Old robots
//class SmallRobot implements RobotInterface {
//    @Override
//    public void print() {
//        System.out.println("This is a small robot!");
//    }
//}//end of class SmallRobot
//
//class LargeRobot implements RobotInterface {
//    @Override
//    public void print() {
//        System.out.println("This is a large robot!");
//    }
//}//end of class LargeRobot