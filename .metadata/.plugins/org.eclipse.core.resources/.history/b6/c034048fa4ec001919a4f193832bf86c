package com.bridgelabz.datastructures;

import com.bridgelabz.algorithmprograms.Utility;

public class PalindromeChecker<T> {

	public static void main(String[] args) {
		
		DequeueUtility<String>util = new DequeueUtility<String>();	
		System.out.println("Enter the String to check whether it is Palindrome or Not :");
				String string = Utility.stringScanner();
				char[] array = string.toCharArray();
				for (Character c : array)
				{
					util.insertLast(c.toString());
				}
								
		String reverseString = "";
		for (int i = 0; i < array.length; i++) {
			reverseString = reverseString + (util.removeLast());
			//System.out.println(reverseString.toString());
		}		
		if(string.equals(reverseString.toString()))
		{
			System.out.println("True.It is an Palindrome.");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
