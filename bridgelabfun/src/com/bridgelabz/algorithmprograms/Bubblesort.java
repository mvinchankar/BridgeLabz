package com.bridgelabz.algorithmprograms;

public class Bubblesort {

	
	/**
	 * Driver method to do Sorting using BubbleSort
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter size :");
		int size = Utility.integerScanner();
		int [] array = new int[size];
		System.out.println("Enter the elements :");
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = Utility.integerScanner();
		}
		/**
		 * Bubblesort is a method to sort the array elements
		 */
        Utility.bubbleSort(array);
        System.out.println("Sorted elements are :");
        for (int i = 0; i < array.length; i++) {
			System.out.println( array[i]);
		}
	}

}
