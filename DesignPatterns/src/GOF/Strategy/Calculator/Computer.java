/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Strategy.Calculator;

/**
 *
 * @author user
 */
public abstract class Computer implements Strategy{
    public Computer nextComputer;    
    public abstract int computeInRange(int num1, int num2);
}
