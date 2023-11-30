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
abstract class BaseEmployee implements IEmployee {
    private String name;
    private int salary;

    public BaseEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public abstract void giveBonus(int bonusPercentage);

    @Override
    public abstract SubordinateIterator createIterator();
}

