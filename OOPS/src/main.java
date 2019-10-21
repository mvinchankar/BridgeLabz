import java.util.Scanner;

public class main { 
/**
 * Driver method to built a stopwatch
 * @param args
 */
   public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
	   int  starttime = (int) System.currentTimeMillis();
	   System.out.println("Enter a key");
	   String k = scanner.next();
	   int endtime  = (int)System.currentTimeMillis();			
	  
	  int  elapsedtime = endtime - starttime;
	    System.out.println(elapsedtime/1000);
	 
	  
			   
	
  }
}