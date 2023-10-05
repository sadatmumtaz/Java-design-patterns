/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Strategy.Calculator;

/**
 *
 * @author user
 */
public class OperationPower extends Computer {

    @Override
    public int doOperation(int num1, int num2) {
        int r = num1;
        for (int a = 1; a < num2; a++) {
            r = r * r;
        }

        return r;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        if (num1 >= 10000 && num1 <= 50000 && num2 >= 10000 && num2 <= 50000) {
            int r = num1;
            for (int a = 1; a < num2; a++) {
                r = r * r;
            }

            return r;
        }

        if (nextComputer != null) {
            return nextComputer.computeInRange(num1, num2);
        }
        System.out.print("Support not available violating range.");
        return 0;
    }

}
