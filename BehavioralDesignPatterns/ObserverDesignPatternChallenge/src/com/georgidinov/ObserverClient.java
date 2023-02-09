package com.georgidinov;

public class ObserverClient {

    public static void main(String[] args) {
        CricketData subject = new CricketData();

        MyObserver averageScoreObserver = new AverageScore();
        MyObserver currentScoreObserver = new CurrentScore();

        subject.register(averageScoreObserver);
        subject.register(currentScoreObserver);

        System.out.println("\nTrigger Subject: Runs = 90, Wickets = 2, Overs = 10.2\n");
        subject.setGameScores(90, 2, 10.2d);

        subject.unregister(averageScoreObserver);

        System.out.println("\nTrigger Subject: Runs = 90, Wickets = 2, Overs = 10.2\n");
        subject.setGameScores(90, 2, 10.2d);

        System.out.println("\nTrigger Subject: Runs = 90, Wickets = 2, Overs = 10.1\n");
        subject.setGameScores(90, 2, 10.1d);

    }//end of main method

}//end of class ObserverClient
