package com.bridgelabz.algorithmprograms;

public class Insertionsort {
	
/**
 * Driver Method to Sort the element using Insertion Sort
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("Enter the size :");
		int size = Utility.integerScanner();
		String []string = new String[size];
		System.out.println("Enter the elements in List :");
		for (int i = 0; i < string.length; i++) {
			string[i] = Utility.stringScanner();
		}
		String [] str = Utility.insertionsortString(string, size);         //Method in Utility which Sort the Element using Insertion Sort
		System.out.println("Sorted elements are :" );
        for (int i = 0; i < str.length; i++) 
        {
	        System.out.println( str[i]);
        }
	}

}
