package com.georgidinov;

public interface HollyWoodMovies {
    void getName();
}//end of interface HollyWoodMovies

class HollyWoodAction implements HollyWoodMovies {
    @Override
    public void getName() {
        System.out.println("Inside HollyWood<Action>::getName() method");
    }
}//end of class HollyWoodAction

class HollyWoodComedy implements HollyWoodMovies {
    @Override
    public void getName() {
        System.out.println("Inside HollyWood<Comedy>::getName() method");
    }
}//end of class HollyWoodComedy