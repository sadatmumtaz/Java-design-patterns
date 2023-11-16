/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author user
 */
// CricketFan.java
public class CricketFan implements MatchObserver {
    private String name;

    public CricketFan(String name) {
        this.name = name;
    }

    @Override
    public void update(String matchStatus) {
        System.out.println(name + " received match update: " + matchStatus);
    }
}

