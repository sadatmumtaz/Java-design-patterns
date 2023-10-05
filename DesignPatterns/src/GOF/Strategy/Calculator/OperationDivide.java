/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Strategy.Calculator;

/**
 *
 * @author user
 */
public class OperationDivide extends Computer{
    public OperationDivide(){}
   
    public OperationDivide(OperationSubstract operationPower) {
        this.nextComputer = operationPower;
    }
    
    
    
   @Override
   public int doOperation(int num1, int num2) {
      return num1 / num2;
   }
   

    @Override
    public int computeInRange(int num1, int num2) {
        if(num1 >= 5000 && num1 <= 10000 && num2 >= 5000 && num2 <= 10000 )
            return num1 / num2;
        if(nextComputer != null)
            return nextComputer.computeInRange(num1, num2);
        System.out.print("Support not available violating range.");
        return 0;
    }
}

