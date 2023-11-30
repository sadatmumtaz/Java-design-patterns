
import GOF.Composite.Observer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Student implements Observer {
    private String name;
    private String major;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public void update(UniversitySubject universitySubject) {
        System.out.println("Student " + name + " majoring in " + major +
                " is notified about the change in the subject " + universitySubject.getSubjectName());
    }
}
