package com.bridgelabz.controller;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.services.StockMethods;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class CommercialDriver {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		Scanner sc = new Scanner(System.in);
		StockMethods control = new StockMethods();
		File file = new File("/home/use/workspace/Commercial/src/StockAccount.json");
		int choice=1;
		while(choice > 0 && choice < 9)
		{
			System.out.println("=================Welcome to StockAccount============\n");
			System.out.println("Companies Listed in Stock Market are :\n"+
			                   "-------------Companies : Symbol of the Company\n"+
					           "-------------Google    : !\n"+
			                   "-------------Amazon    : @\n"+
					           "-------------Facebook  : #\n"+
			                   "-------------IBM       : **\n"+
					           "-------------Dell      : $\n");
			System.out.println("Select Option\n"
					+ "1.Calculate total value of account\n"
					+ "2.Buy shares and add to account\n"
					+ "3.Sell shares\n"
					+ "4.Print Report of Account\n"
					+ "5.Remove Share\n"
					+ "6.Show Transactions\n"
			        + "7.Time of Transactions\n"
					+ "8.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
//			case 1:
//			{
//				control.stockAccount(file);
//				break;
//			}
			
			case 1:
			{
				control.valueOf();
				break;
			}
			
			case 2:
			{
				System.out.println("Enter amount of shares");
				int amount = sc.nextInt();
				System.out.println("Enter Stock Symbol");
				String symbol = sc.next();
				control.buy(amount ,symbol);
				break;
			}
			
			case 3:
			{
				System.out.println("Enter Stock Symbol");
				String symbol = sc.next();
				System.out.println("Enter amount of shares to sell of "+symbol);
				int amount = sc.nextInt();
				control.sell(amount,symbol);
				break;
			}
			
			case 4:
			{
				control.printReport();
				break;
			}
			
			case 5:
			{
				System.out.println("Enter Symbol of share to remove from report");
				String symbol = sc.next();
				control.removeShare(symbol);
				break;
			}
			case 6:
			{
				control.showTransaction();
			}
			case 7:
			{
				control.timeOfTransaction();
			}
			case 8:
			{
				System.exit(0);
			}
			
			}
		}
	}
}