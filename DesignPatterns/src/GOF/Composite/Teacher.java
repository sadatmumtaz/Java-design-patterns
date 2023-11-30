/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Composite;

/**
 *
 * @author user
 */
class Teacher extends BaseEmployee {
    private String qualification;
    private String status;

    public Teacher(String name, int salary, String qualification, String status) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        int bonusAmount = (getSalary() * bonusPercentage) / 100;
        System.out.println("Bonus of " + bonusPercentage + "% given to Teacher " + getName() + ". Bonus Amount: $" + bonusAmount);
    }

    @Override
    public SubordinateIterator createIterator() {
        // Leaf classes do not have subordinates, return null
        return null;
    }
}
