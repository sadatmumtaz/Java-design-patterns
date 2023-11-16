/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author user
 */
import java.util.Random;

public class MatchLiveUpdatesApp {
    public static void main(String[] args) {
        // Creating instances
        CricketFan fan1 = new CricketFan("John");
        CricketFan fan2 = new CricketFan("Alice");

        LiveMatchScreen mainScreen = new LiveMatchScreen();

        //random matches
        for (int i = 0; i < 5; i++) {
            CricketMatch randomMatch = createRandomMatch("Match " + (i + 1));
            mainScreen.addLiveMatch(randomMatch);
        }

        mainScreen.selectMatchFromMenu();

        //match updates
        for (int i = 0; i < 3; i++) {
            CricketMatch randomMatch = mainScreen.getRandomMatch();
            randomMatch.setMatchStatus("In Progress - Score: " + getRandomScore());
        }

        mainScreen.selectMatchFromMenu();
    }

    private static CricketMatch createRandomMatch(String name) {
        CricketMatch match = new CricketMatch();
        match.setMatchStatus(name + ": Yet to Start");
        return match;
    }

    private static String getRandomScore() {
        Random random = new Random();
        int runs = random.nextInt(200);
        int wickets = random.nextInt(10);
        return runs + "/" + wickets;
    }
}
