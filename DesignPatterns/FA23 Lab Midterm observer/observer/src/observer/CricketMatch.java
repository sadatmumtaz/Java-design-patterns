/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author user
 */
// CricketMatch.java
import java.util.ArrayList;
import java.util.List;

public class CricketMatch implements MatchSubject {
    private String matchStatus;
    private List<MatchObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(MatchObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MatchObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (MatchObserver observer : observers) {
            observer.update(matchStatus);
        }
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
        notifyObservers();
    }

    @Override
    public String getMatchDetails() {
        return "Match Details: " + matchStatus;
    }
}

