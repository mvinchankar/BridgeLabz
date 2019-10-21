
package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.model.Stocks;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Stock {

	public static List<Stocks> list = new ArrayList<Stocks>();
	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		File file=new File("/home/use/workspace/Stock/stockfile.json");
		list = mapper.readValue(file, new TypeReference<List<Stocks>>(){});
		//System.out.println(list);
		long totalPriceOfShare;
		System.out.println("******Stock Report******");
		System.out.println();
		System.out.println("Stock Name\t"+"ShareNumber\t"+"PricePerShare\t"+"TotalPriceOfShare\t");
		System.out.println();
		for(int i=0;i<3;i++)
		{
			totalPriceOfShare=(long) (list.get(i).getNumber_shares()*list.get(i).getPrice());
			System.out.println(""+list.get(i).getShare_name()+"\t"+list.get(i).getNumber_shares()+"\t\t"+
			list.get(i).getPrice()+"\t\t"+totalPriceOfShare);
		}

	}

}
