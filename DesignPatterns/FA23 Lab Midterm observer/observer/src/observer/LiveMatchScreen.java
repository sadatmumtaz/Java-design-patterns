/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LiveMatchScreen {
    private List<CricketMatch> liveMatches = new ArrayList<>();

    public void displayLiveMatches() {
        System.out.println("Live Matches:");
        for (int i = 0; i < liveMatches.size(); i++) {
            System.out.println((i + 1) + ". " + liveMatches.get(i).getMatchDetails());
        }
    }

    public void addLiveMatch(CricketMatch match) {
        liveMatches.add(match);
    }

    public void selectMatchFromMenu() {
        Scanner scanner = new Scanner(System.in);

        displayLiveMatches();
        System.out.print("Select a match (enter the corresponding number): ");
        int selection = scanner.nextInt();

        if (selection > 0 && selection <= liveMatches.size()) {
            CricketMatch selectedMatch = liveMatches.get(selection - 1);
            System.out.println("User selected match: " + selectedMatch.getMatchDetails());

            // Simulate navigating to ball-by-ball coverage screen
            BallByBallCoverageScreen coverageScreen = new BallByBallCoverageScreen(selectedMatch);
            coverageScreen.displayBallByBallCoverage();
        } else {
            System.out.println("Invalid selection. Please try again.");
        }
    }

    public CricketMatch getRandomMatch() {
        Random random = new Random();
        int randomIndex = random.nextInt(liveMatches.size());
        return liveMatches.get(randomIndex);
    }
}


