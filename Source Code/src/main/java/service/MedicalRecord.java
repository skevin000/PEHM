package model;

import java.time.LocalDateTime;

// Represents a patient's medical record
public class MedicalRecord {
    private String patientID;
    private LocalDateTime timestamp;
    private String medication;
    private String dosage;
    private String labTest;
    private String testResult;

    // Constructor
    public MedicalRecord(String patientID, LocalDateTime timestamp, String medication, String dosage, String labTest, String testResult) {
        this.patientID = patientID;
        this.timestamp = timestamp;
        this.medication = medication;
        this.dosage = dosage;
        this.labTest = labTest;
        this.testResult = testResult;
    }

    // Getters
    public String getPatientID() { return patientID; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getMedication() { return medication; }
    public String getDosage() { return dosage; }
    public String getLabTest() { return labTest; }
    public String getTestResult() { return testResult; }
}