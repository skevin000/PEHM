package service;

import model.VitalSign;
import model.QueryScenario;

import java.util.List;

// Implements the similarity query algorithm
public class SimilarityQuery {
    // Finds the most similar vital signs for a given query
    public static String findMostSimilar(List<VitalSign> vitalSigns, QueryScenario query) {
        String mostSimilarPatientID = null;
        double minDistance = Double.MAX_VALUE;

        for (VitalSign vitalSign : vitalSigns) {
            if (vitalSign.getPatientID().equals(query.getPatientID())) {
                double distance = calculateDistance(vitalSign, query);
                if (distance < minDistance) {
                    minDistance = distance;
                    mostSimilarPatientID = vitalSign.getPatientID();
                }
            }
        }

        return mostSimilarPatientID;
    }

    // Calculates the Euclidean distance between vital signs and query
    private static double calculateDistance(VitalSign vitalSign, QueryScenario query) {
        double queryValue = Double.parseDouble(query.getQueryCondition().split(" ")[2]);
        double vitalSignValue = 0;

        switch (query.getQueryType()) {
            case "HeartRate":
                vitalSignValue = vitalSign.getHeartRate();
                break;
            case "BloodPressure":
                vitalSignValue = Double.parseDouble(vitalSign.getBloodPressure().split("/")[0]);
                break;
            case "OxygenSaturation":
                vitalSignValue = Double.parseDouble(vitalSign.getOxygenSaturation().replace("%", ""));
                break;
            case "Temperature":
                vitalSignValue = vitalSign.getTemperature();
                break;
        }

        return Math.abs(vitalSignValue - queryValue);
    }
}