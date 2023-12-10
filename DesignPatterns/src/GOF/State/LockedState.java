/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.State;

/**
 *
 * @author user
 */
public class LockedState extends State {

    LockedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new ReadyState(player));
        return "Ready...";
    }

    @Override
    public String onPlay() {
        return "Locked...";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
