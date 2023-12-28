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

        // Example of other classes and their interactions
        System.out.println("\n=== Application Overview ===");

        // Admission Process
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
        surveyDesign.gatherFeedback();

        // Polling Design
        System.out.println("\nPolling Design:");
        PollingDesign pollingDesign = new PollingDesign();
        pollingDesign.conductPolls();
        pollingDesign.periodicPolls();
        pollingDesign.targetedPolls();

        // Direct Contact Design
        System.out.println("\nDirect Contact Design:");
        DirectContactDesign directContactDesign = new DirectContactDesign();
        directContactDesign.establishDedicatedEmail();
        directContactDesign.hotlineForUrgentQueries();
        directContactDesign.inPersonFeedbackSessions();

        // Data Collection and Analysis
        System.out.println("\nData Collection and Analysis:");
        DataCollectionAnalysis dataCollectionAnalysis = new DataCollectionAnalysis();
        dataCollectionAnalysis.useOnlineSurveyTools();
        dataCollectionAnalysis.analyzeData();
        dataCollectionAnalysis.categorizeFeedback();

        // Feedback Integration
        System.out.println("\nFeedback Integration:");
        FeedbackIntegration feedbackIntegration = new FeedbackIntegration();
        feedbackIntegration.sharePositiveFeedback();
        feedbackIntegration.developActionPlan();
        feedbackIntegration.communicateChanges();

        // Continuous Improvement
        System.out.println("\nContinuous Improvement:");
        ContinuousImprovement continuousImprovement = new ContinuousImprovement();
        continuousImprovement.regularReviews();
        continuousImprovement.implementAdjustments();
        continuousImprovement.emphasizeCulture();

        // Communication Strategy
        System.out.println("\nCommunication Strategy:");
        CommunicationStrategy communicationStrategy = new CommunicationStrategy();
        communicationStrategy.developCommunicationPlan();
        communicationStrategy.emphasizeCommitment();

        // Monitoring and Evaluation
        System.out.println("\nMonitoring and Evaluation:");
        MonitoringEvaluation monitoringEvaluation = new MonitoringEvaluation();
        monitoringEvaluation.monitorImpact();
        monitoringEvaluation.evaluateEffectiveness();
        monitoringEvaluation.makeDataDrivenDecisions();
    }
}
