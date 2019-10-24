/*  Purpose: Reading data from JSON file and calculate weight and price for each inventory.
 *
 *  @author :Mangesh Mahesh Vinchankar
 *
 ******************************************************************************/

package com.bridgelabz.controller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.model.Inventory;
import com.bridgelabz.model.Model;
import com.bridgelabz.model.Pulses;
import com.bridgelabz.model.Rice;
import com.bridgelabz.model.Wheat;
import com.bridgelabz.utility.OOPUtility;
import com.fasterxml.jackson.databind.ObjectMapper;


public class InventoryManagement  implements  Serializable
{
	
	private static final long serialVersionUID = 1L; 
	/*
	 * It is a list of Inventory which consists of Various sublists like Rice, Wheat and Pulses.
	 */
	public static List<Inventory> inventoryList = new ArrayList<Inventory>();
	
	
	/*
	 * Driver method for Inventory Management
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception 
	{
	
    ObjectMapper mapper=new ObjectMapper();
    /*
     *BufferReader reads data from the file.  
     */
    BufferedReader reader = new BufferedReader(new FileReader("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/json.json" ));
     
    /*
     * Creation of sublists of Rice, Wheat and Pulses.
     */
    List<Rice> rice=new ArrayList<Rice>();
	List<Wheat> wheat=new ArrayList<Wheat>();
	List<Pulses> pulse=new ArrayList<Pulses>();
	Model list = mapper.readValue(reader, Model.class );
	rice=list.getRice();
	wheat=list.getWheat();
	pulse=list.getPulse();
	   
	//variable declaration
	   long TotalWeight,TotalPrice;
	   String kgs="Kg";
	   String rupees="Rs";
        int counter=0;
        /*
         * while loop
         */
        while(counter>=0)
        {  
            System.out.println("Inventory Products");
            System.out.println("1. Wheat");
            System.out.println("2. Rice");
            System.out.println("3. Pulse");
            System.out.println("4. Exit");
           
            System.out.println("Enter Your Choice:");
            int choice1=OOPUtility.integerScanner();
            /*
             * switch case
             */
          switch(choice1)
          {
          case 1:
        	
        	  System.out.println("--Available Wheats in Inventory--");
        	  for(int i=0;i<3;i++)
        	  {
        		  System.out.println("----------");
        		  /*
        		   * It reads for existing data of Wheat from JSON file
        		   */
        		  System.out.println(list.getWheat().get(i).getName());         
        	  
        	  }
        	  System.out.println();
        	  for(int i=0;i<3;i++)
        	  {
        		  TotalWeight=list.getWheat().get(i).getWeight();
        		  System.out.println("Weight of Wheat : "+TotalWeight +kgs);
        	  }
        	  System.out.println();
              /*
               * It calculates the total Weight of Wheat 
               */
        	  TotalWeight=list.getWheat().get(0).getWeight()+list.getWheat().get(1).getWeight()+list.getWheat().get(2).getWeight();
        	  System.out.println("Total Weight of Wheat : "+TotalWeight +kgs);
        	  System.out.println();
    
        	  for(int i=0;i<3;i++)
        	  {
        		  TotalPrice =list.getWheat().get(i).getWeight()*list.getWheat().get(i).getPrice();
        		  System.out.println("Price of Wheat : "+TotalPrice +rupees);
        	  }
        	  System.out.println();
        	  /*
        	   * It calculates the total Price of Wheat
        	   */
        	  TotalPrice =list.getWheat().get(0).getWeight()*list.getWheat().get(0).getPrice()+ list.getWheat().get(1).getWeight()*list.getWheat().get(1).getPrice()+ list.getWheat().get(2).getWeight()*list.getWheat().get(2).getPrice();
        	  System.out.println("Total Price of Wheat : "+TotalPrice);
        	  System.out.println();
        	  break;
        	  
          case 2:
        	  
        	  System.out.println("--Available Rice in Inventory--");
        	  for(int i=0;i<3;i++)
        	  {
        		  System.out.print("        ");
        		  /*
        		   * Available Rice in Inventory 
        		   */
        		  System.out.print(list.getRice().get(i).getName());
        	  
        	  }
        	  System.out.println();
        	  for(int i=0;i<3;i++)
        	  {
        		  TotalWeight=list.getRice().get(i).getWeight();
        		  System.out.print("       :"+TotalWeight +kgs);
        	  }
        	  System.out.println();
        	  for(int i=0;i<3;i++)
        	  {
        		  TotalPrice =list.getRice().get(i).getWeight()*list.getRice().get(i).getPrice();
        		  System.out.print("       :"+TotalPrice +rupees);
        	  }
        	  System.out.println();
        	  /*
        	   * It calculates Total Weight of Rice
        	   */
        	  TotalWeight=list.getRice().get(0).getWeight()+list.getRice().get(1).getWeight()+list.getRice().get(2).getWeight();
        	  System.out.println("Total Weight of Rice : "+TotalWeight +kgs);
        	  System.out.println();
        	  /*
        	   * It calculates Total Price of Rice
        	   */
        	  TotalPrice =list.getRice().get(0).getWeight()*list.getRice().get(0).getPrice()+ list.getRice().get(1).getWeight()*list.getRice().get(1).getPrice()+ list.getRice().get(2).getWeight()*list.getRice().get(2).getPrice();
        	  System.out.println("Total Price of Rice : "+TotalPrice);
        	  System.out.println();
        	  break;
        	  
          case 3:
        	  
        	  System.out.println("--Available Pulses in Inventory--");
        	  for(int i=0;i<3;i++)
        	  {
        		  System.out.println("----------");
        		  System.out.println(list.getPulse().get(i).getName());
        	  
        	  }
        	  System.out.println();
        	  for(int i=0;i<3;i++)
        	  {
        		  TotalWeight=list.getPulse().get(i).getWeight();
        		  System.out.println("Weight of Pulse : "+TotalWeight +kgs);
        	  }
        	  System.out.println();
              /*
               * It calculates the total Weight of Pulse
               */
        	  TotalWeight=list.getPulse().get(0).getWeight()+list.getPulse().get(1).getWeight()+list.getPulse().get(2).getWeight();
        	  System.out.println("Total Weight of Pulse : "+TotalWeight +kgs);
        	  System.out.println();
    
        	  for(int i=0;i<3;i++)
        	  {
        		  TotalPrice =list.getPulse().get(i).getWeight()*list.getPulse().get(i).getPrice();
        		  System.out.println("Price of Pulse : "+TotalPrice +rupees);
        	  }
        	  System.out.println();
        	  /*
        	   * It calculates Total Price of Pulse
        	   */
        	  TotalPrice =list.getPulse().get(0).getWeight()*list.getPulse().get(0).getPrice()+ list.getPulse().get(1).getWeight()*list.getPulse().get(1).getPrice()+ list.getPulse().get(2).getWeight()*list.getPulse().get(2).getPrice();
        	  System.out.println("Total Price of Pulse : "+TotalPrice);
        	  System.out.println();
        	  break;
        	  
         
          case 4:
        	  counter=1;
        	  System.out.println("Exit");
        	  return;
        	  
        	//default condition
          default:
        	System.out.println("You Entered Wrong Choice!");
        	 counter=1;
        	 return;
        	  
          }//end switch case
        }//end for loop
	}//end main
}//end class
