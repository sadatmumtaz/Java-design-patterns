/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Adapter;

/**
 *
 * @author user
 */
public class MediaAdapter implements MediaPlayer {
   private AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType) {
      if (audioType.equalsIgnoreCase("vlc")) {
         advancedMusicPlayer = new VlcPlayer();
      } else if (audioType.equalsIgnoreCase("mp4")) {
         advancedMusicPlayer = new Mp4Player();
      } else if (audioType.equalsIgnoreCase("wav")) {
         advancedMusicPlayer = new WavPlayer(); // Added support for WavPlayer
      }
   }

   @Override
   public void play(String audioType, String fileName) {
      advancedMusicPlayer.play(fileName);
   }
}
