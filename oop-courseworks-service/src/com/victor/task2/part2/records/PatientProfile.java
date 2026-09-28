package com.victor.task2.part2.records;

/**
 * COURSE CODE: BIT2115 - OOP / JAVA ACCESS MODIFIERS
 * STUDENT: Kambale Mbakulirahi Victor (ID: 24/2018/BSSE-S)
 * DESCRIPTION: Medical record entity demonstrating private encapsulation and public visibility interfaces.
 */
public class PatientProfile {

    // 1. PRIVATE ACCESSIBILITY: Visible strictly within this class context for
    // absolute medical security.
    private String medicalDiagnosis;
    private String prescribedMedication;

    // 2. PUBLIC ACCESSIBILITY: Open to all departments (Receptionists and Doctors).
    public String patientName;
    public String appointmentDate;

    // Parameterized Constructor to securely initialize clinical and basic metrics
    public PatientProfile(String patientName,
                          String appointmentDate,
                          String medicalDiagnosis,
                          String prescribedMedication) {
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.medicalDiagnosis = medicalDiagnosis;
        this.prescribedMedication = prescribedMedication;
    }

    // 3. PUBLIC ACCESSIBILITY INTERFACE: Allows Doctors to view clinical updates safely
    public String getMedicalDiagnosis() {
        return this.medicalDiagnosis;
    }

    // 4. PUBLIC ACCESSIBILITY INTERFACE: Allows Doctors to mutate treatment paths securely
    public void updatePrescription(String newMedication) {
        this.prescribedMedication = newMedication;
    }

    public String getPrescribedMedication() {
        return this.prescribedMedication;
    }
}
// ===> ✅ WELL DONE <=== //