/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author user
 */
// MainScreen.java
import java.util.ArrayList;
import java.util.List;

public class MainScreen {
    private List<CricketMatch> liveMatches = new ArrayList<>();

    public void displayLiveMatches() {
        System.out.println("Live Matches:");
        for (CricketMatch match : liveMatches) {
            System.out.println("- " + match.toString());
        }
    }

    public void addLiveMatch(CricketMatch match) {
        liveMatches.add(match);
    }

    public void selectMatch(CricketMatch match) {
        System.out.println("User selected match: " + match.toString());
        // Simulate navigating to ball-by-ball coverage screen
        BallByBallCoverageScreen coverageScreen = new BallByBallCoverageScreen(match);
        coverageScreen.displayBallByBallCoverage();
    }
}

