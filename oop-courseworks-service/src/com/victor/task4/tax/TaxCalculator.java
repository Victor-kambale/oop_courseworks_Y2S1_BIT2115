package com.victor.task4.tax;

import com.victor.task4.identity.PassportService;

public class TaxCalculator {

    public static void main(String[] args) {
        System.out.println("\n UGANDA GOVERNMENT INTEGRATED MODULAR MANAGEMENT.");
        System.out.println("-------------------------------\n");

        PassportService citizenPassportAudit = new PassportService();
        citizenPassportAudit.processPassport(
                "Kambale Mbakulirahi Victor",
                "24/2018/BSSE-S");

        System.out.println("[FOR TAX MODULE] RUNNING INDEPENDENT DEPARTEMENTAL INCOME ANALYSIS...");
        double monthlyEnterpriseRevenue = 8500000.00;
        double infrastructureTaxRate = 0.06;
        double netAssessedTaxAmount = monthlyEnterpriseRevenue * infrastructureTaxRate;

        System.out.println("Business Assessed Base Capital Balance: UGX "
                + monthlyEnterpriseRevenue);
        System.out.println("Computed Modular Revenue Tax Deducted : UGX "
                + netAssessedTaxAmount);

        System.out.println("\n==========================");
        System.out.println(" VERIFICATION AUDIT COMPLETE: Modular service accessibility " +
                "boundaries standard as well. ");
    }
}
