/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Strategy.Calculator;

/**
 *
 * @author user
 */
public class OperationSubstract extends Computer{

    public OperationSubstract(OperationMultiply operationMultiply) {
    }
   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }

    @Override
    public int computeInRange(int num1, int num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
