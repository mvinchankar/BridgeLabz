/**
 * 
 */
package com.bridgelabz.services;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import com.bridgelabz.model.ShareBean;
import com.bridgelabz.model.StockListBean;
import com.bridgelabz.utility.QueueUtility;
import com.bridgelabz.utility.StackUtility;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.javadoc.ThrowsTag;

/**
 * Stock Methods class contains all Methods which are used in Stock Management
 */
public class StockMethods implements StockInterface
{
	ObjectMapper mapper = new ObjectMapper();
	ShareBean stockDetail = new ShareBean();
	StockListBean sharesList = new StockListBean();
	List<ShareBean> localList = new ArrayList<ShareBean>();
	StackUtility<String> symbolTransaction = new StackUtility<String>();
	QueueUtility<String> timeOfTransaction = new QueueUtility<String>(); 
	File file = new File("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/StockAccount.json");
	Scanner sc = new Scanner(System.in);
	
	
	
	
    /**
     * Buy method to Buy an amount of Stock with particular Stock Symbol
     * @param amount
     * @param Symbol
     */
	public void buy(int amount, String symbol) throws JsonGenerationException, JsonMappingException, IOException
	{
		int counter = 0,i;
		LocalDateTime now  = LocalDateTime.now();
		String date= now.toString();
		
		if(file.length() != 0)
		{
			sharesList = mapper.readValue(file, StockListBean.class);
			/*
			 *Add the elements in a LocalList from File 
			 */
			localList.addAll(sharesList.getStockList());
			try 
			{
				for(i=0;i<localList.size();i++)
				{
					if(sharesList.getStockList().get(i).getSymbol().equals(symbol))
					{
						int currentShare = sharesList.getStockList().get(i).getAmount();
						int add = currentShare+amount; 
						sharesList.getStockList().get(i).setAmount(add);
						/*
						 * Mapper is used to Write the Object into Json File
						 */
						mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
						counter++;
						localList.clear();
						/*
						 *This pushes the Symbol of Stock in Stack wih Bought content 
						 */
				    	symbolTransaction.push(symbol.concat("->").concat("Bought"));
				    	/*
				    	 * This Enqueue the Transaction in a Queue with Stoc Symbol
				    	 */
						timeOfTransaction.enqueue(date.concat("-->".concat(symbol)));
					}
				}
			}
			catch (Exception e)
			{}
		}

		if(counter == 0 || file.length() == 0)
		{
			stockDetail.setAmount(amount);
			stockDetail.setSymbol(symbol);
			stockDetail.setTime(date);
			localList.add(stockDetail);
			sharesList.setStockList(localList);
			/*
			 * It writes the data into File 
			 */
			mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
			localList.clear();
			symbolTransaction.push(symbol.concat("-").concat("Bought"));
			timeOfTransaction.enqueue(date.concat("-".concat(symbol)));
		}
	}
    
	/**
	 * Sell method to sell the amount of Stocks of a Particular Company
	 * @param Amount of Stocks 
	 * @param Symbol of Company
	 */
	public void sell(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException
	{
		DateFormat dateformat = new SimpleDateFormat("dd:MM:yy");
		LocalDateTime now  = LocalDateTime.now();
		String date= now.toString();
		int i;
		if(file.length() != 0)
		{
			sharesList = mapper.readValue(file, StockListBean.class);
			/*
			 * Add all elements from File to LocalList
			 */
			localList.addAll(sharesList.getStockList());
			try 
			{
				for(i=1;i<localList.size();i++)
				{
					if(sharesList.getStockList().get(i).getSymbol().equals(symbol))
					{
						int currentShare = sharesList.getStockList().get(i).getAmount();
						int de = currentShare-amount;
						sharesList.getStockList().get(i).setAmount(de);
						mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
						symbolTransaction.push(symbol.concat("-").concat("Sold"));
						timeOfTransaction.enqueue(date.concat("-".concat(symbol)));
					}
					else if(i==localList.size()-1)
					{
						System.out.println("No shares with this Symbol");
					}
				}
				
			}
			catch(Exception e)
			{}
		}
		else
		{
			System.out.println("No data in StockAccount");
		}	
	}
	
	/**
	 * Method to calculate the Total Amount of Stocks in Market
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public void valueOf() throws JsonParseException, JsonMappingException, IOException
	{
		int total = 0;
		if(file.length()!=0)
		{
			sharesList = mapper.readValue(file, StockListBean.class);
			localList.addAll(sharesList.getStockList());
			/*
			 * Adding each Stocks to calculate the Total Stocks
			 */
			for(int i=0;i<localList.size();i++)
			{
				total = total+sharesList.getStockList().get(i).getAmount();
			}
			System.out.println("Total value of shares in Account is "+total);
		}
	}
	
	/**
	 * Method to print the Report of Stocks 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException 
	 */
	public void printReport() throws JsonParseException, JsonMappingException, IOException
	{
		if(file.length()!= 0)
		{
			sharesList = mapper.readValue(file, StockListBean.class);
			localList.addAll(sharesList.getStockList());
			System.out.println("-------------STOCK REPORT-------------");
			try
			{
			/*
			 * For Loop for getting Every Stock Symbol and their quantity of Shares
		     */
			for(int i=0;i<localList.size();i++)
			{
				String symbol = sharesList.getStockList().get(i).getSymbol();
				System.out.println("Stock Symbol: "+symbol);
				int amount =sharesList.getStockList().get(i).getAmount();
				System.out.println("Number of Shares: "+amount);
				System.out.println("--------------------------------------");
			}
			}
			catch(Exception e) {}
		}
			
	}
	
	/**
	 * Remove Share method to remove the Company Shares from the Market
	 * @param Symbol
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public void removeShare(String symbol) throws JsonParseException, JsonMappingException, IOException
	{
		int i;
		if(file.length() != 0)
		{
			sharesList = mapper.readValue(file, StockListBean.class);
			localList.addAll(sharesList.getStockList());
			try
			{
				for(i=0;i<localList.size();i++)
				{
					/*
					 * If Symbol matches the Symbol which the user want to remove,
					 * It gets removed from Market
					 */
					if(sharesList.getStockList().get(i).getSymbol().equals(symbol))
					{
						sharesList.getStockList().remove(i);
						mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
						System.out.println("Stock with Symbol "+symbol+" Removed");
					}
				}
			} catch (Exception e)
			{
				
			}
			
		}
		else
		{
			System.out.println("Stock Report Empty");
		}
	}

	@Override
	public void stockAccount(File file) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
	}

	
//	public void stockAccount(Object object) throws JsonParseException, JsonMappingException, IOException {
//		String result = " ";
//		result = mapper.writeValueAsString(object);
//		//localList.addAll(sharesList.getStockList());
//		System.out.println(result);
		
//	}
	/**
	 * Method to Show the Date of Transactions 
	 */
	public void showTransaction()
	{
		symbolTransaction.showFullStack();
		System.out.println();
	}
	/**
	 * Method to Show the Time of Transaction
	 */
	public void timeOfTransaction()
	{
		timeOfTransaction.showFullQueue();
	}
	
}

	