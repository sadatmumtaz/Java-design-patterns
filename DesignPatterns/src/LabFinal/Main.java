/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabFinal;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Strategy Pattern Example
        System.out.println("=== Strategy Pattern Example ===");
        FeedbackMechanisms feedbackMechanisms = new FeedbackMechanisms();
        feedbackMechanisms.setStrategy(new SurveyStrategy());
        feedbackMechanisms.executeStrategy();

        // Command Pattern Example
        System.out.println("\n=== Command Pattern Example ===");
        Invoker invoker = new Invoker();
        invoker.setCommand(new DevelopActionPlanCommand());
        invoker.executeCommand();

        System.out.println("\nAdmission Process:");
        AdmissionProcess admissionProcess = new AdmissionProcess();
        admissionProcess.ensureTransparency();
        admissionProcess.enhanceUserExperience();
        admissionProcess.identifyAreasForImprovement();

        // Survey Design
        System.out.println("\nSurvey Design:");
        SurveyDesign surveyDesign = new SurveyDesign();
        surveyDesign.includeQuestions();
        surveyDesign.assessEase();
        surveyDesign.evaluateResponsiveness();

        // Simulate a user giving a review
        System.out.println("\n=== User Gives Review ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your feedback: ");
        String userFeedback = scanner.nextLine();

        // Assume the user feedback is collected and analyzed
        System.out.println("\n=== Processing User Feedback ===");
        DataCollectionAnalysis dataCollectionAnalysis = new DataCollectionAnalysis();
        dataCollectionAnalysis.useOnlineSurveyTools();
        dataCollectionAnalysis.analyzeData();
        dataCollectionAnalysis.categorizeFeedback();

        // Provide feedback to the user
        System.out.println("\n=== Feedback to User ===");
        FeedbackIntegration feedbackIntegration = new FeedbackIntegration();
        feedbackIntegration.sharePositiveFeedback();
        feedbackIntegration.developActionPlan();
        feedbackIntegration.communicateChanges();

        // Close the scanner
        scanner.close();
    }
}
