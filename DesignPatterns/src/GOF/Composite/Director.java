/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
class Director extends BaseEmployee {
    private List<IEmployee> subordinates;

    public Director(String name, int salary) {
        super(name, salary);
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(IEmployee subordinate) {
        subordinates.add(subordinate);
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        int bonusAmount = (getSalary() * bonusPercentage) / 100;
        System.out.println("Bonus of " + bonusPercentage + "% given to Director " + getName() + ". Bonus Amount: $" + bonusAmount);

        // Give bonus to subordinates
        for (IEmployee subordinate : subordinates) {
            subordinate.giveBonus(bonusPercentage);
        }
    }

    @Override
    public SubordinateIterator createIterator() {
        return new CompositeIterator(subordinates);
    }
}