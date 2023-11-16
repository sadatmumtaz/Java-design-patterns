/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.AbstractFactory;

/**
 *
 * @author user
 */

public class DoubleBorderFactory extends AbstractFactory {

    static AbstractFactory getFactory(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   @Override
   public Shape getShape(String shapeType) {    
      if (shapeType.equalsIgnoreCase("RECTANGLE")) {
         return new DoubleBorderedRectangle();
      } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
         return new DoubleBorderedTriangle();
      }
      return null;
   }
}

