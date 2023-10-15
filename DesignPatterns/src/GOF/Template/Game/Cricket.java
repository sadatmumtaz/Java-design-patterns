package GOF.Template.Game;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    protected boolean breakForRefreshmentNow() {
        return true; // Take a break for refreshment
    }

    @Override
    protected void breakForRefreshment() {
        System.out.println("Taking a break for refreshment during the Cricket game.");
    }

    @Override
    protected boolean performShiftNow() {
        return true; // Perform the shift step
    }

    @Override
    protected void performShift() {
        System.out.println("The batting team started fielding now");
    }
}
