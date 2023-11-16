/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.Random;

/**
 *
 * @author user
 */
public class BallByBallCoverageScreen {
    private CricketMatch selectedMatch;

    public BallByBallCoverageScreen(CricketMatch selectedMatch) {
        this.selectedMatch = selectedMatch;
    }

    public void displayBallByBallCoverage() {
        System.out.println("Ball-by-Ball Coverage for match: " + selectedMatch.getMatchDetails());

        
        for (int ballNumber = 1; ballNumber <= 10; ballNumber++) {
            String ballUpdate = simulateBallUpdate(ballNumber);
            System.out.println(ballUpdate);

            
            selectedMatch.setMatchStatus("In Progress - " + ballUpdate);

            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //match completion
        selectedMatch.setMatchStatus("Match Completed - Final Score: " + getRandomScore());
    }

    private String simulateBallUpdate(int ballNumber) {
        Random random = new Random();
        int runs = random.nextInt(7); 
        int wickets = random.nextInt(2); 

        return "Ball " + ballNumber + ": " + runs + " runs, " + wickets + " wickets";
    }

    private String getRandomScore() {
        Random random = new Random();
        int runs = random.nextInt(200);
        int wickets = random.nextInt(10);
        return runs + "/" + wickets;
    }
}



