package com.georgidinov;

class WoodenHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }//end of method buildPillars

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }//end of method buildWalls

}//end of class WoodenHouse


