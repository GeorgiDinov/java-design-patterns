package com.georgidinov;

import java.util.HashMap;
import java.util.Map;

class RobotFactory {

    Map<String, RobotInterface> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }//end of method totalObjectsCreated

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {

        RobotInterface myRobot;

        if (shapes.containsKey(robotType)) {
            myRobot = shapes.get(robotType);
        } else {

            switch (robotType) {
                case "King":
                    System.out.println("We don't have King Robot. So we are creating a King Robot now.");
                    myRobot = new Robot("King");
                    shapes.put("King", myRobot);
                    break;
                case "Queen":
                    System.out.println("We don't have Queen Robot. So we are creating a Queen Robot now.");
                    myRobot = new Robot("Queen");
                    shapes.put("Queen", myRobot);
                    break;
                default:
                    throw new Exception("Robot factory can create only King and Queen shapes!");
            }//end of switch

        }//end of else clause

        return myRobot;

    }//end of method getRobotFromFactory

}//end fo class RobotFactory
