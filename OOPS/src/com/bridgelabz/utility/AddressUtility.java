package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.model.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddressUtility 
{

	static Scanner scanner=new Scanner(System.in);
	public static String stringScanner()
	{
		String string=scanner.next();
		return string;
	}
	public static int integerScanner()
	{
		int integer=scanner.nextInt();
		return integer;
	}
	public static long longScanner()
	{
		long longValue=scanner.nextLong();
		return longValue;
	}
	public static double doubleScanner()
	{
		double doubleValue=scanner.nextDouble();
		return doubleValue;
	}
	public ArrayList<Person> readJsonDataConvertIntoList(File fileName) throws IOException 
	{	
		FileReader fr=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<Person> arrayList = objectMapper.readValue(data, new TypeReference<ArrayList<Person>>(){});
       // System.out.println("list : "+arrayList);
        br.close();
		return arrayList;
	}

	


}
