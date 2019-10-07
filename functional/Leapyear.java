package com.bridgelabz.functional;
import  java.util.Scanner;
public class Leapyear {

    
	
	public static void main(String[] args) {
		int year;
		System.out.println("ENter the year to find as leap yr or not :");
		year = Utility.integerScanner();
		Utility.Leapyear(year);
	}

}
