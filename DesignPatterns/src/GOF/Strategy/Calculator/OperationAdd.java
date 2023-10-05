/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Strategy.Calculator;

/**
 *
 * @author user
 */
public class OperationAdd extends Computer{

   public OperationAdd(){}
   
    public OperationAdd(OperationSubstract operationSubstract) {
        this.nextComputer = operationSubstract;
    }
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }

    @Override
    public int computeInRange(int num1, int num2) {        
        if(num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100 )
            return num1 + num2;
        if(nextComputer != null)
            return nextComputer.computeInRange(num1, num2);
        System.out.print("Support not available violating range.");
        return 0;
    }

}
