import java.util.LinkedList;
import java.util.Random;

/**
 * 
 */

/**
 * @author use
 *
 */
public class Utility {
	
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
        		String card=rank[random2.nextInt(rank.length)]+"-"+suit[random1.nextInt(suit.length)]+"  ";
            	
             if(!list.contains(card))
                 {    
            	     playersCard[j][i]=card;
                     list.add(card);
                 }
             else
             {
            	 i--;
             }
             
         }
        
        
        
        
    }
        return playersCard;
}
}
