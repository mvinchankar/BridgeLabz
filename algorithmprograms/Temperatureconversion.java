package com.bridgelabz.algorithmprograms;

public class Temperatureconversion {

	
	
	public static void main(String[] args) {
		
		double fahrenhiet,celsius;
		System.out.println("1.Celsius to Fahrenhiet :");
		System.out.println("2.Fahrenhiet to Celsius :");
		int ch;
		ch = Utility.integerScanner();
		switch(ch)
		{
		case 1 :
			System.out.println("Enter the Temperature in Celsius :");
			celsius = Utility.doubleScanner();
			Utility.CelsiustoFahrenhiet(celsius);
		    break;
		case 2 :
			System.out.println("Enter the Temperature in Fahrenhiet :");
			fahrenhiet = Utility.doubleScanner();
			Utility.FahrenhiettoCelsius(fahrenhiet);
			break;
		}

	}

}
