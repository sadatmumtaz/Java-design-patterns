/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Visitor.tutorialspoint;

/**
 *
 * @author user
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        ComputerPartMaintainer maintainer = new ComputerPartMaintenanceVisitor();
        computer.maintain(maintainer);

    }
}
