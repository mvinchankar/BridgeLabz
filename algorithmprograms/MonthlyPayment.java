package com.bridgelabz.algorithmprograms;

public class MonthlyPayment {


	public static void main(String[] args) {
		int year,principal_loan;
		float rateofinterest;
		System.out.println("Enter no. of Years :");
        year = Utility.integerScanner();
        System.out.println("Enter the Principal loan Amount :");
        principal_loan = Utility.integerScanner();
        System.out.println("Enter the Rate of Interest :");
        rateofinterest = Utility.floatScanner();
        Utility.monthlypaymentCalculate(year, principal_loan, rateofinterest);
	}

}
