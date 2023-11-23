/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy;

/**
 *
 * @author user
 */
public class ProxyPatternDemo {
	
   public static void main(String[] args) {
      // Example using Virtual Proxy
      Image virtualProxyImage = new VirtualProxyImage("test_10mb.jpg");

      // Image will be loaded from disk
      virtualProxyImage.display(); 
      System.out.println("");
      
      // Image will not be loaded from disk (cached)
      virtualProxyImage.display();

      // Example using Smart Reference Proxy
      Image smartReferenceProxyImage = new SmartReferenceProxyImage("unsupported.bmp");

      // Fake display for unsupported image type
      smartReferenceProxyImage.display();
   }
}
