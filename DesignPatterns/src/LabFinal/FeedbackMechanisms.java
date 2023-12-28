/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal;

/**
 *
 * @author user
 */
class FeedbackMechanisms {
    private FeedbackStrategy strategy;

    public void setStrategy(FeedbackStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        // Execute feedback strategy
        strategy.execute();
    }
}