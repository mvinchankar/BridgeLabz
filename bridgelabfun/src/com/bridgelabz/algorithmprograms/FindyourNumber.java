package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class FindyourNumber {

	public static void main(String[] args) {
		
        int low = 0;
		System.out.println("Enter the range :");
		int n = Integer.parseInt(args[0]);
		FindyourNumber f = new FindyourNumber();
		Utility.findYourNUmber(low,n);                  //Method in Utility to find the Guess Number
		
		
	}

}
