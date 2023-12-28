/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
class Stakeholders {
    // Attributes: Applicants, AdmittedStudents, FacultyMembers, AdministrativeStaff
    private List<String> applicants = new ArrayList<>();
    private List<String> admittedStudents = new ArrayList<>();
    private List<String> facultyMembers = new ArrayList<>();
    private List<String> administrativeStaff = new ArrayList<>();

    // Methods to interact with stakeholders
    public void addApplicant(String applicant) {
        applicants.add(applicant);
    }

    public void admitStudent(String student) {
        admittedStudents.add(student);
    }

    public void addFacultyMember(String faculty) {
        facultyMembers.add(faculty);
    }

    public void addAdministrativeStaff(String staff) {
        administrativeStaff.add(staff);
    }
}
