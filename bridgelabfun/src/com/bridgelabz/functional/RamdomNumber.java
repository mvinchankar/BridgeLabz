package com.bridgelabz.functional;

public class RamdomNumber 
{
	/**
	 * Driver method to find the random number
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 10; i++) 
		{
			//System.out.println(Math.random());
			
			int c = (int)(Math.random() * 100000d*i);
			System.out.println("for coupon " + i + " random number are " + c);
			
		}
		
	}

}
