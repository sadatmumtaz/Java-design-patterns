/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.State;

/**
 *
 * @author user
 */
import java.util.List;

public class TrackIterator {
    private List<String> playlist;
    private int currentTrack = 0;

    public TrackIterator(List<String> playlist) {
        this.playlist = playlist;
    }

    public String nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        return getCurrentTrackInfo();
    }

    public String previousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        return getCurrentTrackInfo();
    }

    public String getCurrentTrackInfo() {
        return "Playing " + playlist.get(currentTrack);
    }

    public void reset() {
        currentTrack = 0;
    }

    public boolean isTrackNumber(int trackNumber) {
        return currentTrack == trackNumber;
    }
}
