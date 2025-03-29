package model;

import java.time.LocalDateTime;

// Represents a patient's vital signs at a specific timestamp
public class VitalSign {
    private String patientID;
    private LocalDateTime timestamp;
    private int heartRate;
    private String bloodPressure;
    private String oxygenSaturation;
    private double temperature;

    // Constructor
    public VitalSign(String patientID, LocalDateTime timestamp, int heartRate, String bloodPressure, String oxygenSaturation, double temperature) {
        this.patientID = patientID;
        this.timestamp = timestamp;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.oxygenSaturation = oxygenSaturation;
        this.temperature = temperature;
    }

    // Getters
    public String getPatientID() { return patientID; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public int getHeartRate() { return heartRate; }
    public String getBloodPressure() { return bloodPressure; }
    public String getOxygenSaturation() { return oxygenSaturation; }
    public double getTemperature() { return temperature; }
}