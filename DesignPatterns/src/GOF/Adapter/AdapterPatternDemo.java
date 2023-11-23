/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Adapter;

/**
 *
 * @author user
 */
public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();

      audioPlayer.play("mp3", "beyond_the_horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far_far_away.vlc");
      audioPlayer.play("wav", "ocean_waves.wav"); // Play a Wav file

      // Utilizing the new WavPlayer directly
      AdvancedMediaPlayer wavPlayer = new WavPlayer();
      wavPlayer.play("birds_chirping.wav");
   }
}