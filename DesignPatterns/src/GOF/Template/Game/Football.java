package GOF.Template.Game;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    protected boolean breakForRefreshmentNow() {
        return true; // Take a break for refreshment
    }

    @Override
    protected void breakForRefreshment() {
        System.out.println("Taking a break for refreshment during the Football game.");
    }

    @Override
    protected boolean performShiftNow() {
        return true; // Perform the shift step
    }

    @Override
    protected void performShift() {
        System.out.println("The poles are shifted between the teams");
    }
}
