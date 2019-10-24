package com.bridgelabz.controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.model.Stocks;
import com.bridgelabz.services.StockMethods;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommercialDriver {
	
    /**
     * Driver method for Stock Management
     * @param args
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		Scanner sc = new Scanner(System.in);
		StockMethods control = new StockMethods();
		ObjectMapper mapper = new ObjectMapper();
		LinkedList<Stocks> linkedlist = new LinkedList<Stocks>();
		File file = new File("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/StockAccount.json");
		File file2 = new File("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/stockfile.json");
		List<Stocks> companyList = new ArrayList(Arrays.asList(mapper.readValue(file2, Stocks[].class)));
		for (int i = 0; i < companyList.size(); i++) {
		
			linkedlist.add(companyList.get(i));
			System.out.println(linkedlist.get(i));
		}
		
		int choice=1;
		while(choice > 0 && choice < 9)
		{
			System.out.println("=======================Welcome to StockAccount=====================\n");
			System.out.println();
			System.out.println("\t\t\tSelect Option\n"
					+ "\t\t\t1.Calculate total value of account\n"
					+ "\t\t\t2.Buy shares and add to account\n"
					+ "\t\t\t3.Sell shares\n"
					+ "\t\t\t4.Print Report of Account\n"
					+ "\t\t\t5.Remove Share\n"
					+ "\t\t\t6.Show Transactions\n"
			        + "\t\t\t7.Time of Transactions\n"
					+ "\t\t\t8.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{	
			case 1:
			{
				/*
				 * valueOf method to calculate Total Amount shares
				 */
				control.valueOf();
				break;
			}
			
			case 2:
			{
				System.out.println("Enter amount of shares");
				int amount = sc.nextInt();
				System.out.println("Enter Stock Symbol");
				String symbol = sc.next();
				/*
				 * buy method to Buy the shares 
				 */
				control.buy(amount ,symbol);
				break;
			}
			
			case 3:
			{
				System.out.println("Enter Stock Symbol");
				String symbol = sc.next();
				System.out.println("Enter amount of shares to sell of "+symbol);
				int amount = sc.nextInt();
				/*
				 * Method to sell the available Number of Shares
				 */
				control.sell(amount,symbol);
				break;
			}
			
			case 4:
			{
				/*
				 * Method to print the report of Transactions
				 */
				control.printReport();
				break;
			}
			
			case 5:
			{
				System.out.println("Enter Symbol of share to remove from report");
				String symbol = sc.next();
				/*
				 * Method to remove the Shares of a Particular Company
				 */
				control.removeShare(symbol);
				break;
			}
			case 6:
			{
				/*
				 * Method to show the date of transaction 
				 */
				control.showTransaction();
				break;
			}
			case 7:
			{
				/*
				 * Method to show time of transaction
				 */
				control.timeOfTransaction();
				break;
			}
			case 8:
			{
				System.exit(0);
			}
			
			}//End of Switch Case
		}//End of While Loop
	}//End of Main Method
}