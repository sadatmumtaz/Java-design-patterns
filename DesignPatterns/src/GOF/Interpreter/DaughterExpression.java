/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Interpreter;

/**
 *
 * @author user
 */
public class DaughterExpression implements Expression {
	 
   private Expression father = null;
   private Expression Daughter = null;

   public DaughterExpression(Expression father, Expression Daughter) { 
      this.father = father;
      this.Daughter = Daughter;
   }

   @Override
   public boolean interpret(String context) {		
      return father.interpret(context) && Daughter.interpret(context);
   }
}
