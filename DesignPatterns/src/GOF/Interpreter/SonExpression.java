/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Interpreter;

/**
 *
 * @author user
 */
public class SonExpression implements Expression {
	 
   private Expression father = null;
   private Expression son = null;

   public SonExpression(Expression father, Expression son) { 
      this.father = father;
      this.son = son;
   }

   @Override
   public boolean interpret(String context) {		
      return father.interpret(context) && son.interpret(context);
   }
}

