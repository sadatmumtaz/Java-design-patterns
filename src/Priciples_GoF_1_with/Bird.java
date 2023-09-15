/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Priciples_GoF_1_with;

/**
 *
 * @author fa20-bse-011
 */
public class Bird {
    Fly fly_engine= new Fly();

    public Bird( FlyInterface fly_engine )
    {
        this.fly_engine = (Fly) fly_engine;
    }

    public Fly fly()
    {
       return this.fly_engine;
    }
    
}
