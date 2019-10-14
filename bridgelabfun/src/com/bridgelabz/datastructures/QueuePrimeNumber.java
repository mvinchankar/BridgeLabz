package com.bridgelabz.datastructures;
import com.bridgelabz.algorithmprograms.Utility;
public class QueuePrimeNumber {
	
	/**
	 * Driver Method to Prime Number and Stored them in Queue
	 * @param args
	 */
public static void main(String[] args) 
{
	int number = Utility.integerScanner();
	QueueUtility<Integer> queue =new QueueUtility<Integer>();
	int [] anagram = Utility.printAnagram(number);
	for (int i = 0; i <anagram.length; i++) 
	{
	 if(anagram[i] !=0)
	 {
		 /*
		  * add the element in Queue
		  */
	  queue.enqueue(anagram[i]);                 
	 }
			//queue.display();
	}
	/*
	 * to display the Anagrams
	 */
	queue.display();                             
 }

}