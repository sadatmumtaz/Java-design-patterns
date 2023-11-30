/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GOF.Composite;

/**
 *
 * @author user
 */
interface IEmployee {
    void giveBonus(int bonusPercentage);

    String getName();

    int getSalary();

    SubordinateIterator createIterator();
}
