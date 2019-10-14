package com.bridgelabz.functional;

import java.util.Scanner;

public class Harmonicnumber {
	
	/**
	 * Driver method to find Harmonic series
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
		float num =FunctionalUtility.floatScanner();
		float sum = FunctionalUtility.harmonic(num);
		System.out.println(sum);
	}

}
