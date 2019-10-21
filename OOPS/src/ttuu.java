import java.io.File;
import java.util.LinkedList;
import java.util.Random;

import com.fasterxml.jackson.databind.ObjectMapper;


public class ttuu{
	    static File file;
	    static ObjectMapper mapper= new ObjectMapper();
	    /** method to create random cards for 4players, each having 9 cards*/
	    public String[][] createCards() {
	        String[] suit= {"C","D","H","S"};
	        String[] rank= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	        String[][] playersCard = new String[4][9];
	        Random random1=new Random();
	        Random random2=new Random();
	        LinkedList<String> list = new LinkedList<String>();
	        for (int j = 0; j < 4; j++)
	        for (int i = 0; i < 9; i++)
	        {
	            String card=rank[random2.nextInt(rank.length)]+"-"+suit[random1.nextInt(suit.length)]+"  ";
	            
	            for (int k = 0; k < 1; k++) {
	                list.add(card);
	                playersCard[j][i]=card;
	            }
	            if(!list.contains(card))
	                {    playersCard[j][i]=card;
	                    list.add(card);
	                }
	            else
	                i--;
	        }
	        
	        //System.out.println(playersCard);
	        return playersCard;
	    }
	    
	    /** method to sort the cards and rank-wise manner*/
	    public String[][] sort(String[][] playersCard) {
	        
	        String[][] cards=playersCard;
	        String temp="";
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 9; j++) {
	                for (int k = 0; k < 9; k++) {
	                    if(cards[i][j].charAt(0) >(cards[i][k]).charAt(0))
	                    {    temp=cards[i][j];
	                    cards[i][j]=cards[i][k];
	                    cards[i][k]=temp;
	                    }
	                }
	            }
	        }
	        return cards;
	    }

	    
}	    
	    
	    
	/**    
	        public static void convertJavaToJson(Person object)
	    {
	                Person person =(Person) object;
	        String state=person.getAddress().getState();
	        String path="/home/user/eclipse-workspace/AddressBook/Books/"+state+".json";
	        file=new File(path);
	            try {    
	                InputStream is = new FileInputStream(new File(path));
	                TypeReference<List<Person>> typeRef = new TypeReference<List<Person>>() {};
	                List<Person> persons= mapper.readValue(is,typeRef);
	                persons.add(object);
	                mapper.writeValue(file, persons);
	            } catch (JsonGenerationException e) {
	                System.out.println("error is: "+e.getMessage());

	            } catch (JsonMappingException e) {
	                System.out.println("error is: "+e.getMessage());
	            } catch (IOException e) {
	                System.out.println("error is: "+e.getMessage());
	            }
	        
	        System.out.println("\nContact added\n\n");
	    }
	    
	    
	   
	-------------------------------------------------

	public class DeckOfCards {
	    static Utility util = new Utility();
	    
	    public static void main(String[] args) {
	        
	        //create cards
	        String[][] playersCard=util.createCards();
	        for (int j = 0; j < 4; j++)
	        {    for (int i = 0; i < 9; i++)
	                {
	                System.out.print(playersCard[j][i]);
	                }
	        System.out.println();
	        
	        }
	        //sort cards
	        
	        System.out.println("\n sorted cards");
	        String[][] sortedCards=util.sort(playersCard);
	        
	        for (int j = 0; j < 4; j++)
	        {    for (int i = 0; i < 9; i++)
	                {
	                System.out.print(sortedCards[j][i]);
	                }
	        System.out.println();
	        }
	        
	        
	    }
	}
**/