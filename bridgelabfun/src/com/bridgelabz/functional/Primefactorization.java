package com.bridgelabz.functional;

import java.util.Scanner;
/**
 * 
 * @author admin1
 *
 */
public class Primefactorization {


	/**
	 * Driver method to find the prime factors
	 * @param args
	 */
	public static void main(String[] args) {
        int number;
		System.out.println("Enter the num to find prime factors :");
		number = FunctionalUtility.integerScanner();
		System.out.println("Prime factors are :");
		FunctionalUtility.primefactors(number);

	}

}
