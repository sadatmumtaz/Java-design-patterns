/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Strategy.Calculator;

/**
 *
 * @author user
 */
public class Context {
   private Computer strategy;

   public Context(Computer strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
   
   public int executeInRangeStrategy(int num1, int num2){
       Computer chainOfStrategies = new OperationAdd(new OperationSubstract(new OperationMultiply( )));
      return chainOfStrategies.computeInRange(num1, num2);
   }
}
