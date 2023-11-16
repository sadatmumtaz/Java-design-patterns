/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author user
 */
// MatchLiveUpdatesApp.java
public class MatchLiveUpdatesApp {
    public static void main(String[] args) {
        // Creating instances
        CricketFan fan1 = new CricketFan("John");
        CricketFan fan2 = new CricketFan("Alice");

        CricketMatch match1 = new CricketMatch();
        CricketMatch match2 = new CricketMatch();

        MainScreen mainScreen = new MainScreen();

        // Registering fans as observers
        match1.registerObserver(fan1);
        match1.registerObserver(fan2);

        match2.registerObserver(fan1);

        // Adding matches to the main screen
        mainScreen.addLiveMatch(match1);
        mainScreen.addLiveMatch(match2);

        // Displaying live matches on the main screen
        mainScreen.displayLiveMatches();

        // Simulating match updates
        match1.setMatchStatus("Match 1: In Progress - Score: 50/1");
        match2.setMatchStatus("Match 2: Yet to Start");

        // User selects a match
        mainScreen.selectMatch(match1);
    }
}

