package com.bridgelabz.utility;

import java.util.Scanner;

public class OOPUtility 
{

	static Scanner scanner=new Scanner(System.in);
	public static String stringScanner()
	{
		String string=scanner.nextLine();
		return string;
	}
	public static int integerScanner()
	{
		int integer=scanner.nextInt();
		return integer;
	}
	public static long longScanner()
	{
		long longValue=scanner.nextLong();
		return longValue;
	}
	public static double doubleScanner()
	{
		double doubleValue=scanner.nextDouble();
		return doubleValue;
	}
	
	


}
