/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator.shapes;

/**
 *
 * @author user
 */
public class Circle implements Shape {
    private double price = 3.0;

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
   
   @Override
    public double getPrice() {
        return price;
    }
}