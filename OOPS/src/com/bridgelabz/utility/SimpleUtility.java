package com.bridgelabz.utility;
import java.util.LinkedList;
import java.util.Random;




/**
 * class Utility
 *
 */
public class SimpleUtility {
	
/**	
 * Method to create cards and stored in 2D array and shuffle those Cards.
 * It returns the Card.
 */
public static String[][] createCards() {
    String[] suit= {"Club","Diamond","Heart","Spade"};
    String[] rank= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    String[][] playersCard = new String[4][9];
    Random random1=new Random();
    Random random2=new Random();
    LinkedList list = new LinkedList();
    for (int j = 0; j < 4; j++)
    {
    	for (int i = 0; i < 9; i++)
    	{
    		/*
    		 * Random generates two elements from array Rank and array Suit.
    		 * Combine those elements to form an Card of Deck.  
    		 */
    		String card=rank[random2.nextInt(rank.length)]+"-"+suit[random1.nextInt(suit.length)]+"  ";
        	
    		/*
    		 * If card is not present in card then add the card to the list 
    		 */
          if(!list.contains(card))
             {    
        	     playersCard[j][i]=card;
                 list.add(card);
             }
          else
          {
        	  /*
        	   * If card is present in the list then reached to card last position .
        	   */
        	 i--;
          }
         
         }
     }
    return playersCard;
  }


/**Method for Sorting the cards
 * 
 * @param playercard
 * @return
 */
public static QueueUtility<String> cardSort(String playercard[][]) 
{
	QueueUtility<String> sortedcard = new QueueUtility<String>();

	String rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	int arr[] = new int[9];
	int index = 0;
	for (int i = 0; i < 4; i++) 
	{
		for (int j = 0; j < 9; j++)
		{

			String temp[] = (playercard[i][j] + " ").split(" ");
			for (int k = 0; k < 13; k++) 
			{
				if (temp[0].equals(rank[k])) 
				{
					arr[index] = k;
					index++;
				}
			}
		}
		System.out.println();
		index = 0;
		for (int k1 = 0; k1 < arr.length - 1; k1++) 
		{
			for (int k2 = k1 + 1; k2 < arr.length; k2++) 
			{
				if (arr[k1] > arr[k2]) 
				{
					int temp = arr[k1];
					arr[k1] = arr[k2];
					arr[k2] = temp;

					String temp1 = playercard[i][k1];
					playercard[i][k1] = playercard[i][k2];
					playercard[i][k2] = temp1;

				}
			}
		}
	}

	for (int i = 0; i < playercard.length; i++)
	{
		QueueUtility<String> temp = new QueueUtility<String>();
		for (int j = 0; j < playercard[i].length; j++)
		{
			temp.enQueue(playercard[i][j]);
			
		}
		sortedcard.enQueue(temp.toString());
	}
	return sortedcard;
}

}
