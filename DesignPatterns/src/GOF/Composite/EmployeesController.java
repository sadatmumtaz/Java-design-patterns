/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Composite;

/**
 *
 * @author user
 */
class EmployeeController implements Observer {
    private Subject universitySubject;

    public EmployeeController(Subject universitySubject) {
        this.universitySubject = universitySubject;
        universitySubject.addObserver(this);
    }

    // Method to generate the organizational structure
    public void generateOrganogram() {
        // Logic to display the organizational structure using Iterator
        System.out.println("University Organizational Structure:");
        displayOrganogram(((UniversityEmployees) universitySubject).getUniversityEmployees(), 0);
    }

    private void displayOrganogram(IEmployee employee, int level) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indentation.append("  ");
        }

        System.out.println(indentation.toString() + employee.getClass().getSimpleName() + ": " + employee.getName() +
                " (Salary: $" + employee.getSalary() + ")");

        SubordinateIterator iterator = employee.createIterator();
        if (iterator != null) {
            while (iterator.hasNext()) {
                IEmployee subordinate = iterator.next();
                displayOrganogram(subordinate, level + 1);
            }
        }
    }

    // Method to activate bonus for all employees
    public void activateBonus(String bonusType, int percentageOfBonus) {
        // Logic to activate bonus for all employees using Iterator
        System.out.println("\nActivating Bonus: " + bonusType + " - " + percentageOfBonus + "%");

        SubordinateIterator iterator = ((UniversityEmployees) universitySubject).getUniversityEmployees().createIterator();
        while (iterator.hasNext()) {
            IEmployee subordinate = iterator.next();
            subordinate.giveBonus(percentageOfBonus);
        }
    }

    // Observer update method
    @Override
    public void update() {
        // Logic to update or respond to changes in the organizational structure
        System.out.println("Organizational structure has changed. Updating...");
        generateOrganogram();
    }
}
