/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Interpreter;

/**
 *
 * @author user
 */
public class InterpreterPatternDemo {

   // Rule: Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }

   // Rule: Julie is a married woman
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }

   // Rule: Stuart is a son of Robert
   public static Expression getSonExpression() {
      Expression robert = new TerminalExpression("Robert");
      Expression stuart = new TerminalExpression("Stuart");
      return new SonExpression(robert, stuart);
   }
   
   // Rule: Stuart is a Daughter of Robert
   public static Expression getDaughterExpression() {
      Expression Julie = new TerminalExpression("Julie");
      Expression Samantha = new TerminalExpression("Samantha");
      return new SonExpression(Julie, Samantha);
   }

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
      Expression isSon = getSonExpression();
      Expression isDaughter = getDaughterExpression();
      

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));
      System.out.println("Stuart is a son of Robert? " + isSon.interpret("Robert Stuart"));
      System.out.println("Julie is a Daughter of Robert? " + isDaughter.interpret("Julie Samantha"));
      
   }
}
