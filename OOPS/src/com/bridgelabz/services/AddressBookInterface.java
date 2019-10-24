/**
 * 
 */
package com.bridgelabz.services;

import java.io.IOException;
import java.util.List;

import com.bridgelabz.model.Person;

/**
 * @author use
 *
 */
public interface AddressBookInterface {
	public List<Person> add(List<Person> arrayList) throws IOException ;
	public List<Person> edit(List<Person> arrayList) throws IOException;
	public List<Person> delete(List<Person> arrayList) throws IOException ;
	public List<Person> sort(List<Person> arrayList) throws IOException ;
	
}
