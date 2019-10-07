package com.bridgelabz.algorithmprograms;

public class DaysofWeek {

	
	public static void main(String[] args) {
		int month,day,year;
		
        System.out.println("Enter Date :");
		day = Utility.integerScanner();
		System.out.println("Enter Month :");
		month = Utility.integerScanner();
		System.out.println("Enter Year :");
		year = Utility.integerScanner();
		Utility.daysOfWeek(day, month, year);
		
		


	}

}
