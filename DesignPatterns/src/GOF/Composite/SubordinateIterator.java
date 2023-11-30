/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Composite;

/**
 *
 * @author user
 */
interface SubordinateIterator {
    boolean hasNext();

    IEmployee next();
}