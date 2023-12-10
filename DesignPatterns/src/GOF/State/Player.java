/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.State;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private boolean playing = false;
    private TrackIterator trackIterator;
    private Timer damageTimer;

    public Player() {
        this.state = new ReadyState(this);
        List<String> playlist = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
        this.trackIterator = new TrackIterator(playlist);
        this.playing = true;

        // Initialize the damage timer
        damageTimer = new Timer(3000, e -> simulateDamage());
        damageTimer.setRepeats(false); // The timer should only run once per play
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void play() {
        String action = state.onPlay();
        System.out.println(action);
    }

    public void pause() {
        if (isPlaying()) {
            System.out.println("Playback paused.");
            setPlaying(false);
        }
    }

    public void stop() {
        if (isPlaying()) {
            state.onLock();
            System.out.println("Playback stopped.");
            setPlaying(false);
        }
    }

    public void next() {
        String action = state.onNext();
        System.out.println(action);
    }

    public void previous() {
        String action = state.onPrevious();
        System.out.println(action);
    }

    public void startPlayback() {
        playing = true;
        String trackInfo = trackIterator.getCurrentTrackInfo();
        System.out.println(trackInfo);
        if (trackIterator.isTrackNumber(4)) { // Check if it's track 5
            damageTimer.start();
        }
    }

    public void stopPlayback() {
        playing = false;
        damageTimer.stop();
        System.out.println("Stopped playing");
    }

    public String nextTrack() {
        damageTimer.stop(); // Stop timer on track change
        return trackIterator.nextTrack();
    }

    public String previousTrack() {
        damageTimer.stop(); // Stop timer on track change
        return trackIterator.previousTrack();
    }

    private void simulateDamage() {
        if (trackIterator.isTrackNumber(4)) {
            stopPlayback();
            JOptionPane.showMessageDialog(null, "Player damaged! Please reset the player.");
            resetPlayer();
        }
    }

    public void resetPlayer() {
        changeState(new ReadyState(this));
        trackIterator.reset();
        setPlaying(false); // Ensure the playing flag is reset
        System.out.println("Player reset.");
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
        if (!playing) {
            damageTimer.stop(); // Ensure the timer is stopped if we're no longer playing
        }
    }

    // Getters and setters for volume, track info, and other settings can be added as needed
}
