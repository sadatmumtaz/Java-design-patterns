/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy;

/**
 *
 * @author user
 */
public class VirtualProxyImage implements Image {

   private RealImage realImage;
   private String fileName;

   public VirtualProxyImage(String fileName) {
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if (realImage == null) {
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}

