/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Iterator.tutorialspoint;

/**
 *
 * @author user
 */


public class IteratorPatternDemo {

   public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        NameRepository.StudentIterator iterator = (NameRepository.StudentIterator) namesRepository.getIterator();

        // Print students with names starting from a provided value
        iterator.printStudentsWithNameStartingFrom("Muhammad");

        // Print all students
        iterator.printAllStudents();
    }
}
