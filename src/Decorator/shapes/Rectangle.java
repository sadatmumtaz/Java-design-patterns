/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator.shapes;

/**
 *
 * @author user
 */
public class Rectangle implements Shape {
    private double price = 5.0;

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }
   
    @Override
    public double getPrice() {
        return price;
    }
}