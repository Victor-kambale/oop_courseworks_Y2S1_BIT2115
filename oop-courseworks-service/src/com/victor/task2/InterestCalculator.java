package com.victor.task2;

/**
 * COURSE CODE: BIT2115 - OOP / DATA CONVERSION CONCEPTS
 * STUDENT: Kambale Mbakulirahi Victor (ID: 24/2018/BSSE-S)
 * DESCRIPTION: Microfinance system demonstrating implicit widening and explicit narrowing primitives.
 */
public class InterestCalculator {

    public static void main(String[] args) {
        System.out.println("===========================================================");
        System.out.println("       IUEA MICROFINANCE INTEREST UTILITY        ");
        System.out.println("===========================================================");

        // 1. INPUT DATA: Customer whole number deposit (32-bit Integer)
        int customerDeposit = 55000;
        double annualInterestRate = 0.0725; // 7.25% interest rate

        System.out.println("[INPUT DATA] Customer Base Deposit: UGX " + customerDeposit);
        System.out.println("[INPUT DATA] Configured Interest Rate: " + (annualInterestRate * 100) + "%\n");

        // 2. IMPLICIT (WIDENING) CONVERSION: Safe & Automatic
        // The 32-bit int 'customerDeposit' is automatically promoted to a 64-bit double
        // before multiplying. No data loss occurs because double has a larger magnitude profile.
        double calculatedInterestDecimal = customerDeposit * annualInterestRate;

        System.out.println("--------------------------------------------------");
        System.out.println(">>> 1. IMPLICIT CONVERSION TRACK (SAFE / DYNAMIC)");
        System.out.println("Exact Computed Decimal Interest Field: " + calculatedInterestDecimal);

        // 3. EXPLICIT (NARROWING) CONVERSION: Necessary & Manual Casting
        // Management demands accounting figures rounded to whole numbers.
        // Converting a 64-bit fractional double to a 32-bit whole int requires an explicit cast (int).
        int roundedManagementReportFigure = (int) calculatedInterestDecimal;

        System.out.println("\n--------------------------------------------------");
        System.out.println(">>> 2. EXPLICIT CONVERSION TRACK (MANUAL CASTING)");
        System.out.println("Final Management Account Balance Output: UGX " + roundedManagementReportFigure);

        // 4. DATA ACCURACY AND PRECISION DEGRADATION ANALYSIS
        // Subtract the rounded integer from the exact decimal to isolate truncated value fields.
        double precisionLossAmount = calculatedInterestDecimal - roundedManagementReportFigure;

        System.out.println("\n--------------------------------------------------");
        System.out.println(">>> 3. ARCHITECTURAL PRECISION LOSS AUDIT REPORT");
        System.out.println("Truncated Residual Currency Bits: UGX " + precisionLossAmount);
        System.out.println("System Threat Assessment: Explicit conversion dropped structural fractional bits!");
        System.out.println("===========================================================");
    }
}

// ===> END ✅ <=== //