/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Builder;

/**
 *
 * @author user
 */
class DietCoke extends ColdDrink {
    @Override
    public float price() {
        return 20.0f;
    }

    @Override
    public String name() {
        return "Diet Coke";
    }
}