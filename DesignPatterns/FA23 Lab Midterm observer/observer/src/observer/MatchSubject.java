/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author user
 */
// MatchSubject.java
import java.util.List;

public interface MatchSubject {
    void registerObserver(MatchObserver observer);
    void removeObserver(MatchObserver observer);
    void notifyObservers();
    String getMatchDetails();
}


