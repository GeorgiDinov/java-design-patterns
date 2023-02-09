package com.georgidinov;

abstract class HouseTemplate {

    //template method, final so subclasses cannot override it
    public final void buildHouse() {
        this.buildFoundations();
        this.buildPillars();
        this.buildWalls();
        this.buildWindows();
        System.out.println("House is built");
    } //end of method buildHouse


    private void buildFoundations() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }//end of method buildFoundations

    //default implementation , hook method
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }//end of method buildWindows

    //methods to be implemented by the subclasses
    public abstract void buildPillars();

    public abstract void buildWalls();

}//end of abstract class HouseTemplate
