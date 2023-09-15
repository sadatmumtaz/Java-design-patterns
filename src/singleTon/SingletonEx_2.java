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
public class SingletonEx_2 {

    private static SingletonEx_2 instance;

    private SingletonEx_2() {
    }

    static SingletonEx_2 getInstance() {
        if (instance == null) {
            synchronized (SingletonEx_2.class) {
                if (instance == null) {
                    instance = new SingletonEx_2();
                }
            }
        }
        return instance;
    }
}