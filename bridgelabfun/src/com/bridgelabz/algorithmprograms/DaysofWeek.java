package com.bridgelabz.algorithmprograms;

public class DaysofWeek {

	
	/**
	 * Driver method to find the Day of a Week  
	 * @param args
	 */
	public static void main(String[] args) {
		int month,day,year;
		
        System.out.println("Enter Date :");
		day = Utility.integerScanner();
		System.out.println("Enter Month :");
		month = Utility.integerScanner();
		System.out.println("Enter Year :");
		year = Utility.integerScanner();
		/**
		 * Method to find Particular Day
		 */
		Utility.daysOfWeek(day, month, year);
		
		


	}

}
