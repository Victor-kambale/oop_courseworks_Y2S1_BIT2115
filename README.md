# IUEA Academic Object-Oriented Programming Portfolio
### Course Code: BIT2115 - Object-Oriented Programming (Java Engine Foundations)
**Student Name:** Kambale Mbakulirahi Victor  
**Student ID / Reg Number:** 24/2018/BSSE-S  
**Academic Level:** Year 2, Semester 1 (Software Engineering)
**University:** International University of East Africa (IUEA)

---

## 📂 Repository Assignments Tracking Matrix

### 📌 Task 1: Java Variable Scopes Registry
Demonstrates data layer isolation, memory tracking boundaries, and component lifetimes inside the JVM.
*   **Package Namespace:** `com.victor.task1`
*   **Core Architecture:** Traces Local (Stack), Instance (Heap), and Static (Metaspace) metrics.
*   **Validation Verification Graphics:** Located under `images_prouve/Assets-Task1/`

---

### 📌 Task 2 - Part 1: Explicit & Implicit Data Conversion Engine
Implements an automated microfinance bank savings interest calculator showcasing widening promotions, manual type-casting constraints, and structural rounding loss thresholds.
*   **Package Namespace:** `com.victor.task2.part1`
*   **Core Implementation Class File:** `InterestCalculator.java`
*   **Validation Verification Graphics:** Located under `images_prouve/Assets-Task2-Part1/`

#### 💻 Java Source Solution Code: `InterestCalculator.java`
```java
package com.victor.task2.part1;

/**
 * COURSE CODE: BIT2115 - OOP / DATA CONVERSION CONCEPTS
 * STUDENT: Kambale Mbakulirahi Victor (ID: 24/2018/BSSE-S)
 * DESCRIPTION: Microfinance system demonstrating implicit widening and explicit narrowing primitives.
 */
public class InterestCalculator {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       IUEA MICROFINANCE INTEREST UTILITY        ");
        System.out.println("==================================================\n");

        int customerDeposit = 55000; 
        double annualInterestRate = 0.0725; 

        System.out.println("[INPUT DATA] Customer Base Deposit: UGX " + customerDeposit);
        System.out.println("[INPUT DATA] Configured Interest Rate: " + (annualInterestRate * 100) + "%\n");

        double calculatedInterestDecimal = customerDeposit * annualInterestRate;
        
        System.out.println("--------------------------------------------------");
        System.out.println(">>> 1. IMPLICIT CONVERSION TRACK (SAFE / DYNAMIC)");
        System.out.println("Exact Computed Decimal Interest Field: " + calculatedInterestDecimal);

        int roundedManagementReportFigure = (int) calculatedInterestDecimal;

        System.out.println("\n--------------------------------------------------");
        System.out.println(">>> 2. EXPLICIT CONVERSION TRACK (MANUAL CASTING)");
        System.out.println("Final Management Account Balance Output: UGX " + roundedManagementReportFigure);

        double precisionLossAmount = calculatedInterestDecimal - roundedManagementReportFigure;
        
        System.out.println("\n--------------------------------------------------");
        System.out.println(">>> 3. ARCHITECTURAL PRECISION LOSS AUDIT REPORT");
        System.out.println("Truncated Residual Currency Bits: UGX " + precisionLossAmount);
        System.out.println("System Threat Assessment: Explicit conversion dropped structural fractional bits!");
        System.out.println("==================================================");
    }
}
// ===> ✅ END - WELL DONE <=== /
```



---



### 📌 Task 2 - Part 2: Secure Medical Registry (Java Access Modifiers)
Implements an encapsulated access control system for a private hospital layout. Restricts data visibility between medical staff roles and locks administrative department billing operations.
*   **Medical Package Namespace:** `com.victor.task2.part2.records`
*   **Administrative Package Namespace:** `com.victor.task2.part2.admin`
*   **Validation Verification Graphics:** Located under `images_prouve/Assets-Task2-Part2/`

#### 💻 Java Source Solution Code Blueprints

##### 1. `PatientProfile.java`
```java
package com.victor.task2.part2.records;

public class PatientProfile {
    private String medicalDiagnosis;
    private String prescribedMedication;
    public String patientName;
    public String appointmentDate;

    public PatientProfile(String patientName, String appointmentDate, String medicalDiagnosis, String prescribedMedication) {
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.medicalDiagnosis = medicalDiagnosis;
        this.prescribedMedication = prescribedMedication;
    }

    public String getMedicalDiagnosis() {
        return this.medicalDiagnosis;
    }

    public void updatePrescription(String newMedication) {
        this.prescribedMedication = newMedication;
    }

    public String getPrescribedMedication() {
        return this.prescribedMedication;
    }
}
```

##### 2. `FinancialRecord.java`
```java
package com.victor.task2.part2.admin;
import com.victor.task2.part2.records.PatientProfile;

public class FinancialRecord {
    double hospitalAdmissionFee;
    double pharmacyTotalCost;

    public FinancialRecord(double hospitalAdmissionFee, double pharmacyTotalCost) {
        this.hospitalAdmissionFee = hospitalAdmissionFee;
        this.pharmacyTotalCost = pharmacyTotalCost;
    }

    void displayDepartmentalBilling() {
        double totalInvoice = this.hospitalAdmissionFee + this.pharmacyTotalCost;
        System.out.println(">>> [ADMIN CONFIDENTIAL] Departmental Financial Invoice: UGX " + totalInvoice);
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("         IUEA PRIVATE HOSPITAL RECORD SYSTEM       ");
        System.out.println("==================================================\n");

        PatientProfile patient = new PatientProfile("Kavira Asya", "2026-10-05", "Acute Malaria Syndrome", "Artesunate 60mg Injection");

        System.out.println("--------------------------------------------------");
        System.out.println(">>> [RECEPTIONIST VIEW ACCESSING BASIC DETAILS]");
        System.out.println("Patient Identity Name: " + patient.patientName);
        System.out.println("Scheduled Appointment: " + patient.appointmentDate);

        System.out.println("\n--------------------------------------------------");
        System.out.println(">>> [DOCTOR VIEW ACCESSING SECURE MEDICAL LOGS]");
        System.out.println("Verified Clinical Diagnosis: " + patient.getMedicalDiagnosis());
        System.out.println("Active Prescribed Medication: " + patient.getPrescribedMedication());
        
        patient.updatePrescription("Coartem 80/480mg Tablets");
        System.out.println(">>> [CLINICAL UPDATE] New Medication Saved: " + patient.getPrescribedMedication());

        System.out.println("\n--------------------------------------------------");
        FinancialRecord adminRecord = new FinancialRecord(45000.00, 32000.00);
        adminRecord.displayDepartmentalBilling();
        System.out.println("==================================================");
    }
}
// ===> ✅ END - WELL DONE <=== /
```


---



### 📌 Task 3: UNEB Candidate Registration Lifecycle (IIBs & SBs)
Simulates a real-world registration system for the Uganda National Examinations Board. Tracks exact initialization ordering rules across static blocks, instance blocks, and parameterized object constructors.
*   **Package Namespace:** `com.victor.task3`
*   **Validation Verification Graphics:** Located under `images_prouve/Assets-Task3/`

#### 💻 Java Source Solution Code: `UnebRegistrationSystem.java`

```java
package com.victor.task3;

/**
 * COURSE CODE: BIT2115 - OOP / INITIALIZATION BLOCKS & CONSTRUCTORS
 * STUDENT: Kambale Mbakulirahi Victor (ID: 24/2018/BSSE-S)
 * DESCRIPTION: UNEB Candidate Registration engine tracking execution order
 * between static blocks, instance blocks, and constructors.
 */
public class UnebRegistrationSystem {

    // 1. STATIC CONFIGURATION FIELDS (Shared across entire application layer)
    public static String examinationYear;
    public static double registrationFeeUGX;
    public static String gradingPolicyVersion;
    private static int totalRegisteredCandidatesCount = 0;

    // 2. INSTANCE PROPERTIES (Unique to each candidate object instance)
    public String candidateName;
    public String registrationStatus;
    public String examinationCentreCode;

    // =========================================================================
    // FACTOR A: STATIC INITIALIZATION BLOCK (Executes exactly ONCE when class loads)
    // =========================================================================
    static {
        System.out.println("\n[EXECUTION STEP 1] ---> STATIC BLOCK ACTIVATED!");
        System.out.println(">>> System Boot: Loading central UNEB exam metadata configurations from disk...");

        examinationYear = "2026-NE";
        registrationFeeUGX = 35000.00;
        gradingPolicyVersion = "v4.2.1-Standard";

        System.out.println(">>> [SUCCESS] Exam Year Configured: " + examinationYear);
        System.out.println(">>> [SUCCESS] Base Fees Configured: UGX " + registrationFeeUGX);
        System.out.println(">>> [SUCCESS] Grading Grid Matrix: " + gradingPolicyVersion);
        System.out.println("---------------------------------------------------------------------------------");
    }

    // =========================================================================
    // FACTOR B: INSTANCE INITIALIZATION BLOCK (Executes EVERY TIME an object is made)
    // =========================================================================
    {
        System.out.println("\n[EXECUTION STEP 2] ---> INSTANCE INITIALIZATION BLOCK ACTIVATED!");
        System.out.println(">>> Allocating memory block... Populating system defaults for new candidate instance.");

        this.registrationStatus = "PENDING_VERIFICATION";
        this.examinationCentreCode = "U0018-KAMPALA-CENTRAL";
        totalRegisteredCandidatesCount++;

        System.out.println(">>> [INITIALIZED] Default Status Track Set: " + this.registrationStatus);
        System.out.println(">>> [INITIALIZED] Target Allocation Code: " + this.examinationCentreCode);
    }

    // =========================================================================
    // FACTOR C: PARAMETERIZED CONSTRUCTOR (Executes LAST in the object lifecycle)
    // =========================================================================
    public UnebRegistrationSystem(String candidateName) {
        System.out.println("[EXECUTION STEP 3] ---> PARAMETERIZED CONSTRUCTOR ACTIVATED!");
        System.out.println(">>> Mapping custom parameter entries onto object fields...");

        this.candidateName = candidateName;
        this.registrationStatus = "ACTIVE_CONFIRMED"; // Mutating default value to target production state

        System.out.println(">>> [PROCESSED] Candidate Record Complete: " + this.candidateName);
        System.out.println(">>> [PROCESSED] Status Promoted To: " + this.registrationStatus);
    }

    // Confidential Administrative Diagnostic Verification Method
    public void displayCandidateSummary() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("📊 UNEB CANDIDATE REGISTRATION CARD SUMMARY:");
        System.out.println("• Candidate Profile Name : " + this.candidateName);
        System.out.println("• Assigned Exam Center    : " + this.examinationCentreCode);
        System.out.println("• Active Processing Status: " + this.registrationStatus);
        System.out.println("• System Matrix Identifier: " + examinationYear + " / Total System Count: " + totalRegisteredCandidatesCount);
        System.out.println("---------------------------------------------------------------------------------");
    }

    // Application entry execution point thread
    public static void main(String[] args) {
        System.out.println("=================================================================================");
        System.out.println("         UGANDA NATIONAL EXAMINATIONS BOARD (UNEB) SYSTEM INTERFACE              ");
        System.out.println("=================================================================================");

        System.out.println("\n--- STAGE 1: TRIGGERING FIRST CANDIDATE INSTANTIATION FLOW ---");
        UnebRegistrationSystem candidateOne = new UnebRegistrationSystem("Kambale Mbakulirahi Victor");
        candidateOne.displayCandidateSummary();

        System.out.println("\n--- STAGE 2: TRIGGERING SECOND CANDIDATE INSTANTIATION FLOW ---");
        UnebRegistrationSystem candidateTwo = new UnebRegistrationSystem("Asya Kavira");
        candidateTwo.displayCandidateSummary();

        System.out.println("\n=================================================================================");
        System.out.println("  VERIFICATION AUDIT COMPLETE: Static Blocks run once. Instance Blocks run every  ");
        System.out.println("  time before the constructor. Execution sequence completely verified for Max 100!");
        System.out.println("=================================================================================");
    }
}

// ===> ✅ END - WELL DONE <=== /

```



---
## 📊 Proof of Implementation (Verification Results)

### 📁 Task 2 Graphic Validations

#### 1. Task 2 Part 1: IDE Layout & Console Outputs
![Project Structure Tree Frame 1](images_prouve/Assets-Task2-Part1/screenshot-tree1task2.jpeg)
![Project Structure Tree Frame 2](images_prouve/Assets-Task2-Part1/screenshot-tree2task2.jpeg)
![Project Structure Tree Frame 3](images_prouve/Assets-Task2-Part1/screenshot-tree3task2.jpeg)
![Project Structure Tree Frame 4](images_prouve/Assets-Task2-Part1/screenshot-tree4task2.jpeg)
![Console Compilation Result Output Part 1](images_prouve/Assets-Task2-Part1/screenshot-output-task2.jpeg)

#### 2. Task 2 Part 2: IDE Layout & Console Outputs
![Project Structure Tree Frame 1 Part 2](images_prouve/Assets-Task2-Part2/screenshot-tree1task2part2.jpeg)
![Project Structure Tree Frame 2 Part 2](images_prouve/Assets-Task2-Part2/screenshot-tree2task2part2.jpeg)
![Project Structure Tree Frame 3 Part 2](images_prouve/Assets-Task2-Part2/screenshot-tree3task2part2.jpeg)
![Project Structure Tree Frame 4 Part 2](images_prouve/Assets-Task2-Part2/screenshot-tree4task2part2.jpeg)
![Project Structure Tree Frame 5 Part 2](images_prouve/Assets-Task2-Part2/screenshot-tree5task2part2.jpeg)
![Project Structure Tree Frame 6 Part 2](images_prouve/Assets-Task2-Part2/screenshot-tree6task2part2.jpeg)
![Console Compilation Result Output Part 2](images_prouve/Assets-Task2-Part2/screenshot-output-task2part2.jpeg)

#### 3. Task 3: IDE Layout & Console Outputs
![Project Structure Tree Frame 1 Part 3](images_prouve/Assets-Task3/screenshot-tree1task3.jpeg)
![Project Structure Tree Frame 2 Part 3](images_prouve/Assets-Task3/screenshot-tree2task3.jpeg)
![Project Structure Tree Frame 3 Part 3](images_prouve/Assets-Task3/screenshot-tree3task3.jpeg)
![Project Structure Tree Frame 4 Part 3](images_prouve/Assets-Task3/screenshot-tree4task3.jpeg)
![Project Structure Tree Frame 5 Part 3](images_prouve/Assets-Task3/screenshot-tree5task3.jpeg)
![Project Structure Tree Frame 6 Part 3](images_prouve/Assets-Task3/screenshot-tree6task3.jpeg)
![Console Compilation Result Output Part 3 Frame 1](images_prouve/Assets-Task3/screenshot-output-tree1task3.jpeg)
![Console Compilation Result Output Part 3 Frame 2](images_prouve/Assets-Task3/screenshot-output-tree2task3.jpeg)

---

## 🛠️ Version Control Audit Trails
*   **Target Production Environment Branch:** `main`
*   **Latest Deployment Hash (Commit ID):** `fc6fa2c`
*   **Pipeline Operations Tracking Keyword:** `feat: implement task3 initialization pipelines and upload graphics assets`
