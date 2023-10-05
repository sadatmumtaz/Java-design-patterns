/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Strategy.Calculator;

/**
 *
 * @author user
 */
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd(new OperationSubstract(new OperationMultiply())));		
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract(new OperationMultiply()));		
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
      
      context = new Context(new OperationDivide());		
      System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
      
      context = new Context(new OperationPower());		
      System.out.println("10 ^ 2 = " + context.executeStrategy(10, 2));
      
      
       System.out.println(".........................");
       
             System.out.println("Using Strategy with Chain of Responsibility ...");
      System.out.println("Computer in Range 44 , 44 = "+context.executeInRangeStrategy(44, 44));
      context.executeInRangeStrategy(44, 144);
      
      context.executeInRangeStrategy(120, 150);
       System.out.println("");
      context.executeInRangeStrategy(120, 1250);
   }
}
