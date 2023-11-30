/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Composite;

/**
 *
 * @author user
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        // Create University Employees structure
        Director director = new Director("John Director", 50000);
        HOD hodMarketing = new HOD("Bob HOD", 30000, "Marketing");
        HOD hodSales = new HOD("Alice HOD", 30000, "Sales");
        Teacher teacher1 = new Teacher("Teacher 1", 20000, "Ph.D.", "Permanent");
        Teacher teacher2 = new Teacher("Teacher 2", 20000, "M.Sc.", "Contract");
        DOO doo = new DOO("Mike DOO", 40000, "Rank 1");

        director.addSubordinate(hodMarketing);
        director.addSubordinate(hodSales);
        hodMarketing.addSubordinate(teacher1);
        hodSales.addSubordinate(teacher2);
        director.addSubordinate(doo);

        // Create UniversityEmployees subject
        UniversityEmployees universitySubject = new UniversityEmployees(director);

        // Create EmployeeController as an Observer
        EmployeeController controller = new EmployeeController(universitySubject);

        // Generate and display the organizational structure
        controller.generateOrganogram();

        // Activate bonus for all employees
        controller.activateBonus("Yearly Bonus", 10);

        // Simulate a change in the organizational structure
        // For example, adding a new employee
        Teacher newTeacher = new Teacher("New Teacher", 25000, "Ph.D.", "Contract");
        director.addSubordinate(newTeacher);
        universitySubject.setUniversityEmployees(director);
    }
}
