package com.georgidinov;

class GlassHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Glass coating");
    }//end of method buildPillars

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }//end of method buildWalls

}//end of class GlassHouse