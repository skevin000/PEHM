# PEHM
### **Usage Instructions**

#### **Dataset Usage**

1. Place the dataset files (`Medical_Records.csv`, `Patient_Info_100.csv`, `Query_Scenarios.csv`, and `Vital_Signs.csv`) in the `src/resources/` directory.
2. Ensure that the format of the dataset files matches the parsing logic in the code.

#### **Code Usage**

1. Place the code files in the `src/main/java/` directory, organized according to the project structure.
2. Run `Main.java` to load the data and execute the similarity query algorithm.
3. The output will display the most similar patient ID for each query.


Project Structure：
```
src/
├── main/
│   ├── java/
│   │   ├── model/
│   │   │   ├── Patient.java
│   │   │   ├── VitalSign.java
│   │   │   ├── MedicalRecord.java
│   │   │   ├── QueryScenario.java
│   │   ├── service/
│   │   │   ├── DataLoader.java
│   │   │   ├── PrivacyPreservingFunction.java
│   │   │   ├── SimilarityQuery.java
│   │   ├── Main.java
│   ├── resources/
│   │   ├── Medical_Records.csv
│   │   ├── Patient_Info_100.csv
│   │   ├── Query_Scenarios.csv
│   │   ├── Vital_Signs.csv
```
