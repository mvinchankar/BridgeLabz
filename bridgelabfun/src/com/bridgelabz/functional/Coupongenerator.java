package com.bridgelabz.functional;
import java.util.Arrays;
import java.util.Scanner;

public class Coupongenerator {

		
	
	
/***
 * Driver method to generate Distinct Coupons	
 * @param args
 */
	public static void main(String[] args) {
		    int numberofiterations,count = 0;
			System.out.println("Enter the number of coupons you want to generate :");
			numberofiterations = FunctionalUtility.integerScanner();
		    int [] a = new int[numberofiterations];
		    double[] c = new double[numberofiterations];
		    int []b = new int[numberofiterations];
		    FunctionalUtility.functionGenerator(numberofiterations, a,count);
      
	      }

        
	
}
