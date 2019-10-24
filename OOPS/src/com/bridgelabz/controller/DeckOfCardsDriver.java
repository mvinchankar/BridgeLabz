package com.bridgelabz.controller;
import java.util.LinkedList;
import java.util.Random;

import com.bridgelabz.utility.SimpleUtility;

public class DeckOfCardsDriver 
{
	public static void main(String[] args)
	{
		/*
		 * createCards is a method in Utility class which generate the card.
		 */
		String playercard[][] = SimpleUtility.createCards();
		SimpleUtility.cardSort(playercard);
		System.out.println("Randomly Distributed Deck of Cards to Four People :\n");
//		System.out.println("Player 1\tPlayer 2\tPlayer 3\tPlayer 4");
		System.out.println();
		int x = 0;
		int y = 0;
		for (int i = 0; i < 4; i++) 
		{
			System.out.print("Player"+ i +"\t\t");
			for (int j = 0; j < 9; j++) 
			{
				System.out.print(playercard[x][y] + "\t");
				y++;
				/*
				 * If y = 9 means row length at its max position then make position equals to zero and column to +1.
				 * 
				 */
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









































