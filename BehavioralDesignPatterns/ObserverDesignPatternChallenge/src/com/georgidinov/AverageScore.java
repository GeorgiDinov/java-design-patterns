package com.georgidinov;

class AverageScore implements MyObserver {

    private double runRate;
    private double predictedScore;

    @Override
    public void update(int runs, int wickets, double overs) {
        this.calculateScore(runs, overs);
        this.display();
    }//end of method update

    private void display() {
        System.out.println("Average Score Display: " +
                "\nRun Rate: " + String.format("%.6f", this.runRate) +
                "\nPredicted Score: " + String.format("%.0f", this.predictedScore) + "\n");
    }//end of method printAverageScore

    private void calculateScore(int runs, double overs) {
        this.runRate = runs / overs;
        this.predictedScore = this.runRate * 50;
    }//end of method calculateScore

}//end of class AverageScore
