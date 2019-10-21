package com.bridgelabz.services;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * 
 */

/**
 * 
 */
public interface StockInterface
{
	
	public void stockAccount(File file) throws JsonParseException, JsonMappingException, IOException;
	public void buy(int amount, String symbol) throws JsonGenerationException, JsonMappingException, IOException;
	public void sell(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException;
	public void valueOf() throws JsonParseException, JsonMappingException, IOException;
	public void printReport() throws JsonParseException, JsonMappingException, IOException;
	public void removeShare(String symbol) throws JsonParseException, JsonMappingException, IOException;
	
	
}