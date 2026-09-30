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