/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Adapter;

/**
 *
 * @author user
 */
public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter;

   @Override
   public void play(String audioType, String fileName) {
      if (audioType.equalsIgnoreCase("mp3")) {
         System.out.println("Playing mp3 file. Name: " + fileName);
      } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("wav")) {
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      } else {
         System.out.println("Invalid media. " + audioType + " format not supported");
      }
   }
}