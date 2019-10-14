package com.bridgelabz.datastructures;

import com.bridgelabz.algorithmprograms.Utility;

/**
 * Driver Method to find the Parenthesis is Balanced or not
 * @author admin1
 *
 */
public class BalancedParenthesis {

		 public static void main(String[] args) {
			 System.out.println("Enter the Expression you want to check as it is Balnced or Not :");
			 String inputPattern = Utility.stringScanner();
			 
			 char[] inputArray = inputPattern.toCharArray();
			 StackUtility stack = new StackUtility();
			 
			 for(int i=0;i<inputArray.length;i++){
			    if(inputArray[i] == '[' || inputArray[i] == '{' || inputArray[i] == '(')
			   {
			    	/*
			    	 * push the first element to the stack 
			    	 */
			     stack.push(inputArray[i]);                                                  
			   }
			   else if((stack.peek() == '[' && inputArray[i] == ']') ||                     
					   (stack.peek() == '{' && inputArray[i] == '}') || 
					   (stack.peek() == '(' && inputArray[i] == ')'))
			   {
				   /*
				    * pop the element if find the parenthesis
				    */
			     stack.pop();                                                               
			   }
			 }
			 
			 if(stack.isEmpty())
			 {
			 System.out.println("Balanced Parenthesis");
			 }
			 else
			 {
			 System.out.println("Un-Balanced Parenthesis");
			 }

	   }
	}

	
