/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Adapter;

/**
 *
 * @author user
 */
public class Mp4Player implements AdvancedMediaPlayer {
   @Override
   public void play(String fileName) {
      System.out.println("Playing mp4 file. Name: " + fileName);
   }
}
