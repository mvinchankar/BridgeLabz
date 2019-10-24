package com.bridgelabz.controller;

import com.bridgelabz.utility.OOPUtility;
import com.bridgelabz.utility.SimpleUtility;

class ExtendDeckOfCards 
{
	public static void main(String[] args) 
	 {  
		String playercard[][] = SimpleUtility.createCards();
		SimpleUtility.cardSort(playercard);
		
		System.out.println("Player 1          Player 2          Player 3          Player 4");
		
		System.out.println();
		
		int x = 0;
		int y = 0;
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				System.out.print(playercard[x][y] + "          ");
				y++;
				if (y == 9) 
				{
					y = 0;
					x++;
				}
			}
			System.out.println();
		}
	}
}

