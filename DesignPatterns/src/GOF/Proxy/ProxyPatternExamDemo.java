/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy;

/**
 *
 * @author user
 */
public class ProxyPatternExamDemo {
   
   public static void main(String[] args) {
      // Example using Virtual Proxy
      Exam virtualProxyExam = new VirtualProxyExam();

      // Exam data will be loaded only once
      virtualProxyExam.load();

      // Display results for a specific student
      virtualProxyExam.displayResults("student123");

      // Example using Protected Proxy
      Exam protectedProxyExam = new ProtectedProxyExam("teacher");

      // Exam data will be loaded only once
      protectedProxyExam.load();

      // Display results for all students (teacher's view)
      protectedProxyExam.displayResults("anyStudentId");
   }
}
