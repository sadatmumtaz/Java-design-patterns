/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator.shapes;

/**
 *
 * @author user
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    private double decorationPrice;

    public ShapeDecorator(Shape decoratedShape, double decorationPrice) {
        this.decoratedShape = decoratedShape;
        this.decorationPrice = decorationPrice;
    }

    @Override
    public double getPrice() {
        return decoratedShape.getPrice() + decorationPrice;
    }

    public void drawWithCost() {
        decoratedShape.draw();
        System.out.println("Cost: $" + getPrice());
    }
}