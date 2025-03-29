package service;

import model.Patient;
import model.VitalSign;
import model.MedicalRecord;
import model.QueryScenario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

// Loads data from CSV files into Java objects
public class DataLoader {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Load patient data from CSV
    public static List<Patient> loadPatients(String filePath) throws IOException {
        List<Patient> patients = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                patients.add(new Patient(
                    data[0], Integer.parseInt(data[1]), data[2], data[3], data[4], data[5]
                ));
            }
        }
        return patients;
    }

    // Load vital signs data from CSV
    public static List<VitalSign> loadVitalSigns(String filePath) throws IOException {
        List<VitalSign> vitalSigns = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                vitalSigns.add(new VitalSign(
                    data[0], LocalDateTime.parse(data[1], DATE_TIME_FORMATTER),
                    Integer.parseInt(data[2]), data[3], data[4], Double.parseDouble(data[5])
                ));
            }
        }
        return vitalSigns;
    }

    // Load medical records data from CSV
    public static List<MedicalRecord> loadMedicalRecords(String filePath) throws IOException {
        List<MedicalRecord> medicalRecords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                medicalRecords.add(new MedicalRecord(
                    data[0], LocalDateTime.parse(data[1], DATE_TIME_FORMATTER),
                    data[2], data[3], data[4], data[5]
                ));
            }
        }
        return medicalRecords;
    }

    // Load query scenarios data from CSV
    public static List<QueryScenario> loadQueryScenarios(String filePath) throws IOException {
        List<QueryScenario> queryScenarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                queryScenarios.add(new QueryScenario(
                    data[0], data[1], LocalDateTime.parse(data[2], DATE_TIME_FORMATTER),
                    data[3], data[4], data[5]
                ));
            }
        }
        return queryScenarios;
    }
}