package com.georgidinov;

public interface BullyWoodMovies {
    void getName();
}//end of interface BullyWoodMovies


class BullyWoodAction implements BullyWoodMovies {
    @Override
    public void getName() {
        System.out.println("***Inside BullyWood<Action>::getName() method");
    }
}//end of class BullyWoodAction

class BullyWoodComedy implements BullyWoodMovies {
    @Override
    public void getName() {
        System.out.println("***Inside BullyWood<Comedy>::getName() method");
    }
}//end of class BullyWoodComedy