package com.bridgelabz.algorithmprograms;

public class MyMergeSort  
{  

	/**
	 * DriverMethod to Sort the elements using Merge Sort
	 * @param args
	 */
public static void main(String args[])  
{  
	System.out.println("Enter the number of elements :");
	int size = Utility.integerScanner();
	
int arr[] = new int[size];
System.out.print("Enter the elements :");
for (int i = 0; i < arr.length; i++) {
	arr[i]  = Utility.integerScanner();
}
Utility.mergeSort(arr, 0, arr.length-1);   //Method in a Utility to Sort the elements
   
System.out.println("\nSorted array");  
for(int i =0; i<arr.length;i++)  
{  
    System.out.println(arr[i]+"");  
}  
}  
}  