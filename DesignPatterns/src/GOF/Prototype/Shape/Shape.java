/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Prototype.Shape;

/**
 *
 * @author user
 */

abstract class Shape implements Cloneable {

   private String id;
   protected String type;

   abstract void draw();

   public String getType() {
      return type;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
         return null;
      }
   }

   public boolean equals(Shape a) {
      return this.getType().equals(a.getType());
   }
}