package com.bridgelabz.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PermutationofString {
    
		
	/**
	 * Driver Method to calculate the permutation of a string using recursion and iterations
	 * @param args
	 */
	public static void main(String[] args)
	{
		String s = "ABC";
		String[] s1 = FunctionalUtility.iterations(s);
		int count = 0;
		FunctionalUtility.recursion(s.toCharArray(), 0);
		for(int i = 0;i<s1.length;i++)
		{
			for (int j = i+1   ; j < s1.length; j++) {
				if(s1[i] == s1[j])
				{
					System.out.println("Arrays are Equals ");
				}
				else
				{
					count =count +1;
				}
			}
		}
		if(count >0)
		{
			System.out.println("Permutations Arrays are Distinct");
		}
		
		
		
	}
}