package com.victor.task2.part2.admin;

import com.victor.task2.part2.records.PatientProfile;

/**
 * COURSE CODE: BIT2115 - OOP / JAVA ACCESS MODIFIERS
 * STUDENT: Kambale Mbakulirahi Victor (ID: 24/2018/BSSE-S)
 * DESCRIPTION: Admin manager handling billing structures and acting as the runtime application entry engine.
 */
public class FinancialRecord {

    // PACKAGE-PRIVATE / DEFAULT ACCESSIBILITY: Accessible only within 'com.victor.task2.part2.admin' package boundaries.
    // This strictly isolates private medical billing files from regular hospital receptionists.
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

    // Core Runtime Application Entry Point Thread Execution
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("         IUEA PRIVATE HOSPITAL RECORD SYSTEM       ");
        System.out.println("==================================================\n");

        // Instantiating a patient case profile
        PatientProfile patient = new PatientProfile(
                "Kavira Asya",
                "2026-10-05",
                "Acute Malaria Syndrome",
                "Artesunate 60mg Injection"
        );

        // --- 👥 ROLE 1: RECEPTIONIST WORKSPACE PROFILE VIEW ---
        System.out.println("--------------------------------------------------");
        System.out.println(">>> [RECEPTIONIST VIEW ACCESSING BASIC DETAILS]");
        System.out.println("Patient Identity Name: " + patient.patientName);
        System.out.println("Scheduled Appointment: " + patient.appointmentDate);
        // CRITICAL CHECK: Un-commenting the line below triggers a compilation error because fields are private
        // System.out.println(patient.medicalDiagnosis); // BLOCKED!

        // --- 🩺 ROLE 2: DOCTOR WORKSPACE PROFILE VIEW & EDIT ---
        System.out.println("\n--------------------------------------------------");
        System.out.println(">>> [DOCTOR VIEW ACCESSING SECURE MEDICAL LOGS]");
        System.out.println("Verified Clinical Diagnosis: " + patient.getMedicalDiagnosis());
        System.out.println("Active Prescribed Medication: " + patient.getPrescribedMedication());

        // Doctor altering prescription route safely via public method interface
        patient.updatePrescription("Coartem 80/480mg Tablets");
        System.out.println(">>> [CLINICAL UPDATE] New Medication Saved: " + patient.getPrescribedMedication());

        // --- 💼 ROLE 3: ADMIN FINANCIAL AUDITING VIEW ---
        System.out.println("\n--------------------------------------------------");
        FinancialRecord adminRecord = new FinancialRecord(45000.00, 32000.00);
        adminRecord.displayDepartmentalBilling();
        System.out.println("==================================================");
    }
}

// ===> ✅ END - WELL DONE <=== //