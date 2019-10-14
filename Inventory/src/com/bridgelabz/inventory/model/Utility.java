package com.bridgelabz.inventory.model;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Utility {
 private static ObjectMapper mapper;
 static {
	 mapper = new ObjectMapper();
 }
 public static String convert(Object object)
 {
	 String result = "";
	 try {
		result = mapper.writeValueAsString(object);
	} catch (JsonGenerationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 return result;
 }
}
