/**
 * 
 */
package com.bridgelabz.service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.model.ShareBean;
import com.bridgelabz.model.StockListBean;
import com.bridgelabz.utility.QueueUtility;
import com.bridgelabz.utility.StackUtility;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 */
public class StockMethods implements StockInterface
{
	ObjectMapper mapper = new ObjectMapper();
	ShareBean stockDetail = new ShareBean();
	StockListBean sharesList = new StockListBean();
	List<ShareBean> localList = new ArrayList<ShareBean>();
	StackUtility<String> symbolTransaction = new StackUtility<String>();
	QueueUtility<String> timeOfTransaction = new QueueUtility<String>(); 
	File file = new File("/home/use/workspace/Commercial/src/StockAccount.json");
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	public void buy(int amount, String symbol) throws JsonGenerationException, JsonMappingException, IOException
	{
		int counter = 0,i;
		LocalDateTime now  = LocalDateTime.now();
		String date= now.toString();
		
		if(file.length() != 0)
		{
			sharesList = mapper.readValue(file, StockListBean.class);
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
						mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
						counter++;
						localList.clear();
				    	symbolTransaction.push(symbol.concat("->").concat("Bought"));
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
			mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
			localList.clear();
			symbolTransaction.push(symbol.concat("-").concat("Bought"));
			timeOfTransaction.enqueue(date.concat("-".concat(symbol)));
		}
	}

	public void sell(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException
	{
		LocalDateTime now  = LocalDateTime.now();
		String date= now.toString();
		int i;
		if(file.length() != 0)
		{
			sharesList = mapper.readValue(file, StockListBean.class);
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
	
	public void valueOf() throws JsonParseException, JsonMappingException, IOException
	{
		int total = 0;
		if(file.length()!=0)
		{
			sharesList = mapper.readValue(file, StockListBean.class);
			localList.addAll(sharesList.getStockList());
			
			for(int i=0;i<localList.size();i++)
			{
				total = total+sharesList.getStockList().get(i).getAmount();
			}
			System.out.println("Total value of shares in Account is "+total);
		}
	}
	
	public void printReport() throws JsonParseException, JsonMappingException, IOException
	{
		if(file.length()!= 0)
		{
			sharesList = mapper.readValue(file, StockListBean.class);
			localList.addAll(sharesList.getStockList());
			System.out.println("-------------STOCK REPORT-------------");
			try
			{
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
	
	public void showTransaction()
	{
		symbolTransaction.showFullStack();
		System.out.println();
	}
	
	public void timeOfTransaction()
	{
		timeOfTransaction.showFullQueue();
	}
	
}

	