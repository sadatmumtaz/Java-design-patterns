/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleTon;

/**
 *
 * @author fa20-bse-011
 */
public class SingletonEx_1 {

    private static SingletonEx_1 instance = new SingletonEx_1();

    private SingletonEx_1() {
    }

    static SingletonEx_1 getInstance() {
        return instance;
    }
}
