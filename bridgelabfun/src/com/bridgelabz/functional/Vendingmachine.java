package com.bridgelabz.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendingmachine 
{

	
	int a[] = {1000,500,200,100,50,20,10,5,2,1};
	List<Integer> list = new ArrayList<Integer>();
	//public List <Integer> count = new ArrayList<Integer>();
	int count = 0;
	int k = 0;
	int[] b = new int[10];
	public void  Amount (int amount)throws NullPointerException
	{
		
		
		for (int i = 0; i < a.length; i++) 
		{
			int temp;
       		while(amount>=a[i])
		   {
       		//list.add(a[i]);	
			amount = amount - a[i];
			count++;
		   }
       		b[i] = count;
       		count = 0;
		//System.out.println(count[i]);
		
	    }
		
	}
	public void display()
	{
		for (int i = 0; i < b.length; i++) 
		{
			if(b[i] != 0)
			System.out.println(a[i] + "    " + b[i]);
			
		}
	}
		
		
	public static void main(String[] args) {
	 Vendingmachine vm = new Vendingmachine();
	 Scanner s = new Scanner(System.in);
	 System.out.println("ENter the amount to be withdraw :");
	 
	int	amount = s.nextInt();
	vm.Amount(amount);
	vm.display();
	
	
	

	}

}
