package com.georgidinov;

interface Player {
    //intrinsic
    void mission();

    //extrinsic
    void assignWeapon(String weapon);

}//end of interface Player

class Terrorist implements Player {

    private static final String TASK = "PLANT A BOMB";
    private String terroristWeapon;

    @Override
    public void mission() {
        System.out.print(this.getClass().getSimpleName() +
                " assigned with weapon " + this.terroristWeapon);
        System.out.println(" | Task is " + TASK);
    }//end of method mission

    @Override
    public void assignWeapon(String weapon) {
        this.terroristWeapon = weapon;
    }//end of method assignWeapon

}//end of class Terrorist

class CounterTerrorist implements Player {

    private static final String TASK = "DIFFUSE BOMB";
    private String counterTerroristWeapon;

    @Override
    public void mission() {
        System.out.print(this.getClass().getSimpleName() +
                " assigned with weapon " + this.counterTerroristWeapon);
        System.out.println(" | Task is " + TASK);
    }//end of method mission

    @Override
    public void assignWeapon(String weapon) {
        this.counterTerroristWeapon = weapon;
    }//end of method assignWeapon

}//end of class Terrorist
