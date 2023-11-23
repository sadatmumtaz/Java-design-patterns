/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Prototype.Shape;

/**
 *
 * @author user
 */
public class PrototypePatternDemo {
   public static void main(String[] args) {
      ShapeCache.loadCache();

      // Clone shapes
      Shape clonedShape = (Shape) ShapeCache.getShape("1");
      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");

      // Compare shapes
      System.out.println("Shape 1 equals Shape 2: " + clonedShape.equals(clonedShape2));
      System.out.println("Shape 1 equals Shape 3: " + clonedShape.equals(clonedShape3));

      // Clone Avatars
      Shape avatar1 = (Shape) new Avatar("Fish");
      Shape avatar2 = (Shape) new Avatar("Fish");

      // Compare Avatars
      System.out.println("Avatar 1 equals Avatar 2: " + avatar1.equals(avatar2));
   }
}