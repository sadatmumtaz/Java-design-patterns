package GOF.Template.Game;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();
        
        if (breakForRefreshmentNow()) {
            breakForRefreshment();
        }

        if (performShiftNow()) {
            performShift();
        }

        //end game
        endPlay();
    }

    protected boolean performShiftNow() {
        return false;
    }

    protected void performShift() {
        // Default implementation, can be overridden by subclasses
    }

    protected boolean breakForRefreshmentNow() {
        return false;
    }

    protected void breakForRefreshment() {
        // Default implementation, can be overridden by subclasses
    }

}
