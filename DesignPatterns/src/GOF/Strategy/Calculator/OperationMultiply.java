/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Strategy.Calculator;

/**
 *
 * @author user
 */
public class OperationMultiply extends Computer{
    
    public OperationMultiply(){}
   
    public OperationMultiply(OperationSubstract operationDivid) {
        this.nextComputer = operationDivid;
    }
    
    
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }

    @Override
    public int computeInRange(int num1, int num2) {
        if(num1 >= 1000 && num1 <= 5000 && num2 >= 1000 && num2 <= 5000 )
            return num1 * num2;
        if(nextComputer != null)
            return nextComputer.computeInRange(num1, num2);
        System.out.print("Support not available violating range.");
        return 0;
    }
}
