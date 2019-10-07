package com.bridgelabz.functional;

import java.util.Scanner;

public class Harmonicnumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
		float num =Utility.floatScanner();
		float sum = Utility.harmonic(num);
		System.out.println(sum);
	}

}
