/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy;

/**
 *
 * @author user
 */
public class ProtectedProxyExam implements Exam {

   private RealExam realExam;
   private String teacherId;

   public ProtectedProxyExam(String teacherId) {
      this.teacherId = teacherId;
   }

   @Override
   public void load() {
      // Load the exam data only once (virtual proxy)
      if (realExam == null) {
         System.out.println("Loading exam data (virtual proxy)...");
         realExam = new RealExam();
         realExam.load();
      }
   }

   @Override
   public void displayResults(String studentId) {
      if (teacherId.equals("teacher")) {
         // Teacher sees collection of all exam results
         System.out.println("Displaying results for all students: " + realExam);
      } else {
         // Student sees only their own results (protected proxy)
         realExam.displayResults(studentId);
      }
   }
}

