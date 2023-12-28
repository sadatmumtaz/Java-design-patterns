/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Example usage:

        // Strategy Pattern Example
        FeedbackMechanisms feedbackMechanisms = new FeedbackMechanisms();
        feedbackMechanisms.setStrategy(new SurveyStrategy());
        feedbackMechanisms.executeStrategy();

        // Command Pattern Example
        Invoker invoker = new Invoker();
        invoker.setCommand(new DevelopActionPlanCommand());
        invoker.executeCommand();

        // You can instantiate other classes and demonstrate their interactions as needed
    }
}