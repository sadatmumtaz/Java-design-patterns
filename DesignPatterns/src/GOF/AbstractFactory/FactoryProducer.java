/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.AbstractFactory;

/**
 *
 * @author user
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(boolean rounded, boolean DoubleRounded){   
      if(rounded){
         return new RoundedShapeFactory();         
      }
      else if(DoubleRounded){
         return new ShapeFactory();
      }
      else{
         return new ShapeFactory();
      }
   }
}