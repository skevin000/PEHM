package model;

import java.time.LocalDateTime;

// Represents a query scenario for patient data
public class QueryScenario {
    private String queryID;
    private String patientID;
    private LocalDateTime queryTimestamp;
    private String queryType;
    private String queryCondition;
    private String queryResult;

    // Constructor
    public QueryScenario(String queryID, String patientID, LocalDateTime queryTimestamp, String queryType, String queryCondition, String queryResult) {
        this.queryID = queryID;
        this.patientID = patientID;
        this.queryTimestamp = queryTimestamp;
        this.queryType = queryType;
        this.queryCondition = queryCondition;
        this.queryResult = queryResult;
    }

    // Getters
    public String getQueryID() { return queryID; }
    public String getPatientID() { return patientID; }
    public LocalDateTime getQueryTimestamp() { return queryTimestamp; }
    public String getQueryType() { return queryType; }
    public String getQueryCondition() { return queryCondition; }
    public String getQueryResult() { return queryResult; }
}