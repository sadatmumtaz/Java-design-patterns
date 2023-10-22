/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Visitor.tutorialspoint;

/**
 *
 * @author user
 */
public interface ComputerPartMaintainer {
    void maintain(Computer computer);
    void maintain(Mouse mouse);
    void maintain(Keyboard keyboard);
    void maintain(Monitor monitor);
    void maintain(Multimedia multimedia);
}