/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Basic.Visitor;

/**
 *
 * @author user
 */
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}
