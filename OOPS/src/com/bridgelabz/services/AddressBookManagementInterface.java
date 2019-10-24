/**
 * 
 */
package com.bridgelabz.services;

import java.io.IOException;
import java.util.List;

import com.bridgelabz.model.Person;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * @author use
 *
 */
public interface AddressBookManagementInterface {
	 public void createNewAddressBook() throws IOException;
	 public  List<Person>  openAddressBook(String fileName) throws IOException;
	 public void save(List<Person> arrayList) throws JsonGenerationException, JsonMappingException, IOException;
	 public void saveAs() throws IOException;
	 public void deleteFile() throws JsonGenerationException, JsonMappingException, IOException ;
	 

}
