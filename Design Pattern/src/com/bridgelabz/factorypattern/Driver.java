package com.bridgelabz.factorypattern;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	
		ComputerFactory factoryInstance = new ComputerFactory(); 
		
		System.out.println("Hello Please enter type of Computer");
		String type = scanner.next();
		
		Computer type1 = factoryInstance.getInstance(type);
		type1.displayTypeOfComputer();
		
	}


}
