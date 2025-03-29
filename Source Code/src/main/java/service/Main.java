package main;

import model.Patient;
import model.VitalSign;
import model.MedicalRecord;
import model.QueryScenario;
import service.DataLoader;
import service.PrivacyPreservingFunction;
import service.SimilarityQuery;

import java.io.IOException;
import java.util.List;

// Main class to run the algorithm
public class Main {
    public static void main(String[] args) {
        try {
            // Load data
            List<Patient> patients = DataLoader.loadPatients("resources/Patient_Info_100.csv");
            List<VitalSign> vitalSigns = DataLoader.loadVitalSigns("resources/Vital_Signs.csv");
            List<MedicalRecord> medicalRecords = DataLoader.loadMedicalRecords("resources/Medical_Records.csv");
            List<QueryScenario> queryScenarios = DataLoader.loadQueryScenarios("resources/Query_Scenarios.csv");

            // Perform similarity queries
            for (QueryScenario query : queryScenarios) {
                String mostSimilarPatientID = SimilarityQuery.findMostSimilar(vitalSigns, query);
                System.out.println("Query ID: " + query.getQueryID() + ", Most Similar Patient ID: " + mostSimilarPatientID);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}