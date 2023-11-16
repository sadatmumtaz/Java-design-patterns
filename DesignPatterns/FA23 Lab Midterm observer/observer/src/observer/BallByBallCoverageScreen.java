/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author user
 */
// BallByBallCoverageScreen.java
public class BallByBallCoverageScreen {
    private CricketMatch selectedMatch;

    public BallByBallCoverageScreen(CricketMatch selectedMatch) {
        this.selectedMatch = selectedMatch;
    }

    public void displayBallByBallCoverage() {
        System.out.println("Displaying ball-by-ball coverage for match: " + selectedMatch.getMatchDetails());
        // Simulate displaying live updates
    }
}


