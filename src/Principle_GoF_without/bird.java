/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principle_GoF_without;

/**
 *
 * @author fa20-bse-011
 */
public class bird extends fly {
  fly fly_engine;

    public bird() {
        this.fly_engine = new fly();
    }
 
}
