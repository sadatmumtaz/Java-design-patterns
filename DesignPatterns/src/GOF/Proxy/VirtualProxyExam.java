/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Proxy;

/**
 *
 * @author user
 */
public class VirtualProxyExam implements Exam {

   private RealExam realExam;

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
      // Display the results for the specific student
      realExam.displayResults(studentId);
   }
}


