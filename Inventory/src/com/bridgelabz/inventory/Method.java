package com.bridgelabz.inventory;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Method 
{
	static ObjectMapper mapper=new ObjectMapper();
	
	static
	{
		mapper=new ObjectMapper();
	}
	
	public static String toConvert(Object object )
	{
		String invent="";	
		try 
		{
		 invent=mapper.writeValueAsString(object);
		} 
		catch (JsonGenerationException e) 
		{
			System.out.println("Exception occured while convrting java object into json"+e.getMessage());
		} 
		catch (JsonMappingException e) 
		{
			System.out.println("Exception occured while convrting java object into json"+e.getMessage());
		} 
		catch (IOException e) 
		{
			System.out.println("Exception occured while convrting java object into json"+e.getMessage());
		}
		return invent;
		
	}
	
	
	/**
	 * Purpose : Saving all the data into file
	 * 
	 * @param T is the list which contains all the details of the products
	 * @param file is the name of the file in which data is to be saved
	 */
	public static <T> void save(List<T> T, String file)
	{
		ObjectMapper mapper = new ObjectMapper();
		try 
		{
			mapper.writeValue(new File("/home/use/workspace/json.json" ), T);
			System.out.println("\n Saved");
		} 
		catch (JsonGenerationException e) 
		{
			e.printStackTrace();
		} 
		catch (JsonMappingException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}
