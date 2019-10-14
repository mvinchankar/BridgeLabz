package com.bridgelabz.functional;

public class WindChill {

/**
 * Driver method to find the WindChill 	
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("ENter the value of t :");
		int temperature = Integer.parseInt(args[0]);
		System.out.println("Enter the value of v :");
		int velocity = Integer.parseInt(args[1]);
		FunctionalUtility.windChill(temperature,velocity);

	}

}
