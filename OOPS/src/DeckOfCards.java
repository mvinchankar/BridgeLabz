import java.util.LinkedList;
import java.util.Random;

public class DeckOfCards 
{
	public static void main(String[] args)
	{
		String playercard[][] = Utility.createCards();
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









































//
///**Method for Sorting the cards
// * 
// * @param playercard
// * @return
// */
//public static Queue<Queue<String>> cardSort(String playercard[][]) 
//{
//	Queue<Queue<String>> sortedcard = new Queue<>();
//
//	String rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
//	int arr[] = new int[9];
//	int index = 0;
//	for (int i = 0; i < 4; i++) 
//	{
//		for (int j = 0; j < 9; j++)
//		{
//
//			String temp[] = (playercard[i][j] + " ").split(" ");
//			for (int k = 0; k < 13; k++) 
//			{
//				if (temp[1].equals(rank[k])) 
//				{
//					arr[index] = k;
//					index++;
//				}
//			}
//		}
//		System.out.println();
//		index = 0;
//		for (int k1 = 0; k1 < arr.length - 1; k1++) 
//		{
//			for (int k2 = k1 + 1; k2 < arr.length; k2++) 
//			{
//				if (arr[k1] > arr[k2]) 
//				{
//					int temp = arr[k1];
//					arr[k1] = arr[k2];
//					arr[k2] = temp;
//
//					String temp1 = playercard[i][k1];
//					playercard[i][k1] = playercard[i][k2];
//					playercard[i][k2] = temp1;
//
//				}
//			}
//		}
//	}
//
//	for (int i = 0; i < playercard.length; i++)
//	{
//		Queue<String> temp = new Queue<>();
//		for (int j = 0; j < playercard[i].length; j++)
//		{
//			Queue.enQueue(playercard[i][j]);
//			
//		}
//		sortedcard.enQueue(temp);
//	}
//	return sortedcard;
//}
