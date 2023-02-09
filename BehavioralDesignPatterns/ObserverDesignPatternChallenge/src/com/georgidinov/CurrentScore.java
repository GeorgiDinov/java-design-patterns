package com.georgidinov;

class CurrentScore implements MyObserver {

    private int runs;
    private int wickets;
    private double overs;

    @Override
    public void update(int runs, int wickets, double overs) {
        this.initializeState(runs, wickets, overs);
        this.display();
    }//end of method update

    private void display() {
        System.out.println("Current Score Display: " +
                "\nRuns: " + this.runs +
                "\nWickets: " + this.wickets +
                "\nOvers: " + this.overs + "\n");
    }//end of method printAverageScore

    private void initializeState(int r, int w, double o) {
        this.runs = r;
        this.wickets = w;
        this.overs = o;
    }//end of method initializeState

}//end of class CurrentScore
