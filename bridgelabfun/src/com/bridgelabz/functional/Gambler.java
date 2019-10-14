package com.bridgelabz.functional;

import java.util.Scanner;

public class Gambler {

	
	/**
	 * Driver method to Gamble
	 * @param args
	 */
	public static void main(String[] args) {
        int stake,goal,numberofIterations;
		
		System.out.println("Enter the Stake Amount :");
		stake = FunctionalUtility.integerScanner();
		System.out.println("Enter the Goal Amount :");
		goal = FunctionalUtility.integerScanner();
		System.out.println("Enter the number of times you want to Gamble :");
		numberofIterations= FunctionalUtility.integerScanner();
	    FunctionalUtility.playGambler(stake,goal,numberofIterations);


	}

}
