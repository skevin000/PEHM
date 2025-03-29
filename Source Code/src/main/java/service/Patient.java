package model;

// Represents a patient with basic information
public class Patient {
    private String patientID;
    private int age;
    private String gender;
    private String admissionDate;
    private String dischargeDate;
    private String diagnosis;

    // Constructor
    public Patient(String patientID, int age, String gender, String admissionDate, String dischargeDate, String diagnosis) {
        this.patientID = patientID;
        this.age = age;
        this.gender = gender;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.diagnosis = diagnosis;
    }

    // Getters
    public String getPatientID() { return patientID; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getAdmissionDate() { return admissionDate; }
    public String getDischargeDate() { return dischargeDate; }
    public String getDiagnosis() { return diagnosis; }
}