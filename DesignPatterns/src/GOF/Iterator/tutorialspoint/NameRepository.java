/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Iterator.tutorialspoint;

/**
 *
 * @author user
 */
public class NameRepository implements Container {

    public Student students[] = {
        new Student(1, "Robert", "Male", "123-456-7890"),
        new Student(2, "John", "Male", "987-654-3210"),
        new Student(3, "Julie", "Female", "555-555-5555"),
        new Student(4, "Lora", "Female", "888-888-8888")
    };

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    class StudentIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index >= 0 && index < students.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return students[index++];
            }
            return null;
        }

        // Add support for the previous() method
        public Object previous() {
            if (index > 0) {
                return students[--index];
            }
            return null;
        }

        // Add support for the moveToLast() method
        public void moveToLast() {
            index = students.length - 1;
        }

        // Add support for the moveToFirst() method
        public void moveToFirst() {
            index = 0;
        }

        // Method to print students whose name starts with a given value
        public void printStudentsWithNameStartingFrom(String startingValue) {
            moveToFirst();
            while (index < students.length) {
                Student student = (Student) students[index];
                if (student.getName().startsWith(startingValue)) {
                    System.out.println("Name: " + student.getName());
                } else {
                    // Exit the loop when a non-matching name is found
                    break;
                }
                index++;
            }
        }

        // Method to print all students
        public void printAllStudents() {
            moveToFirst();
            while (this.hasNext()) {
                Student student = (Student) this.next();
                System.out.println("RegNo: " + student.getRegNo());
                System.out.println("Name: " + student.getName());
                System.out.println("Gender: " + student.getGender());
                System.out.println("Phone Number: " + student.getPhoneNumber());
                System.out.println();
            }
        }
    }
}
