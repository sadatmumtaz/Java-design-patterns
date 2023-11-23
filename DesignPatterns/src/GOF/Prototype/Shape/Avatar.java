/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Prototype.Shape;

/**
 *
 * @author user
 */

class Avatar extends Shape {

   public Avatar(String type) {
      this.type = type;
   }

   @Override
   public void draw() {
      System.out.println("Inside Avatar::draw() method.");
   }
}
