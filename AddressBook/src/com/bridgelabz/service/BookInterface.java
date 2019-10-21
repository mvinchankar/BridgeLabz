/**
 * 
 */
package com.bridgelabz.service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * @author use
 *
 */
public interface BookInterface {
	
	public void addData(File file) throws JsonGenerationException, JsonMappingException, IOException;
	public void openFile(File[] listOfFiles) throws IOException;
	public void saveAs(File file) throws IOException;
	public void readFromFile(File file) throws JsonParseException, JsonMappingException, IOException;
	public void getData(int i);

}
