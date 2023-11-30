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
class DOO extends BaseEmployee {
    private String rank;

    public DOO(String name, int salary, String rank) {
        super(name, salary);
        this.rank = rank;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        int bonusAmount = (getSalary() * bonusPercentage) / 100;
        System.out.println("Bonus of " + bonusPercentage + "% given to DOO " + getName() + ". Bonus Amount: $" + bonusAmount);
    }

    @Override
    public SubordinateIterator createIterator() {
        // Leaf classes do not have subordinates, return null
        return null;
    }
}

