package com.georgidinov;

interface DisplayModule {
    void display();
}

class Monitor implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display through a monitor!");
    }

}//end of class Monitor

class Projector implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display throufh a projector");
    }
}//end of class Projector

public class Main {
    DisplayModule dm;

    public static void main(String[] args) {
        Main main = new Main();
        DisplayModule monitor = new Monitor();
        DisplayModule projector = new Projector();

        main.setDisplayModule(monitor);
        main.display();
        main.setDisplayModule(projector);
        main.display();

        main.setDisplayModule(() -> System.out.println("Display through Lambda!"));
        main.display();
    }//end of main method

    public void setDisplayModule(DisplayModule dm) {
        this.dm = dm;
    }//end of method setDisplayModule

    public void display() {
        this.dm.display();
    }//end of method display

}//end of class Main
