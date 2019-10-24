package com.bridgelabz.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.Person;
import com.bridgelabz.utility.Utility;

/**
 * AddressBook Class has multiple methods like add,edit,delete and Sort
 * @author use
 *
 */
public class AddressBook implements AddressBookInterface
{
	AddressBookManagement addressManager = new AddressBookManagement();
	String filePath = "";
	private Utility utility = new Utility();
	Address address = new Address();
	
	/**
	 * Add method to add Person Details in a AddressBook 
	 * Person Details like Name,Mobile Number and Address 
	 * @param arrayList
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("static-access")
	public List<Person> add(List<Person> arrayList) throws IOException 
	{
		Person person = new Person();

		System.out.println("\n\t\t\t\tP E R S O N-D E T A I L S");
		System.out.println("\t\t\t\t----------------------------");
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = utility.stringScanner();
		person.setFirstname(firstName);
		
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = utility.stringScanner();
		person.setLastname(lastName);
	
		System.out.print("\t\t\t\tEnter the City       : ");
		String city = utility.stringScanner();
		address.setCity(city);
		
		System.out.print("\t\t\t\tEnter the State      : ");
		String state = utility.stringScanner();
        address.setCity(city);
		
        System.out.print("\t\t\t\tEnter the Zip-Code   : ");
		int pincode = utility.integerScanner();
		address.setPincode(pincode);
		
		System.out.print("\t\t\t\tEnter the Mobile No  : ");
		String mobileNo = utility.stringScanner();
		person.setMobile_number(mobileNo);

		/*
		 * Create Temp as an object to store in a ArrayList  
		 */
		Person temp = new Person(firstName, lastName, mobileNo, new Address(city,state,pincode));
		arrayList.add(temp);

		System.out.println();

		for(int i=0;i<arrayList.size();i++)
		{
			 System.out.println(arrayList.get(i).getFirstname());
			 System.out.println(arrayList.get(i).getLastname());
			 System.out.println(arrayList.get(i).getMobile_number());
			 System.out.println(arrayList.get(i).getAddress());
		}
		return arrayList;
	}
	/**
	 * Method to Edit the Person DEtails in an Address Book 
	 * @param arrayList
	 * @return
	 * @throws IOException
	 */
     public List<Person> edit(List<Person> arrayList) throws IOException {
		System.out.println("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details!");
		System.out.println();
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = Utility.stringScanner();
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = Utility.stringScanner();

		/*
		 * Loop for (if name equals Infile name then do further operations like editing of address,city,state,
		 * pincode,mobile number,etc 
		 */
		for (int i = 0; i < arrayList.size(); i++)
			if (firstName.equals(arrayList.get(i).getFirstname()) && lastName.equals(arrayList.get(i).getLastname())) {
				System.out.println("\n\t\t\t\t   E D I T-D E T A I L S");
				System.out.println("\t\t\t\t--------------------------------");
				System.out.print("\n\t\t\t\tEdit User   Address : Enter 1");
				System.out.print("\n\t\t\t\tEdit User   City    : Enter 2");
				System.out.print("\n\t\t\t\tEdit User   State   : Enter 3");
				System.out.print("\n\t\t\t\tEdit Zip    Number  : Enter 4");
				System.out.print("\n\t\t\t\tEdit Mobile Number  : Enter 5");
				System.out.println();
				System.out.print("\n\t\t\t\tEnter Key Which You Want to Edit : ");
				int key = Utility.integerScanner();

				String newCity = "", newState = "";
				int newZip = 0;
				String newMobileno = "";

				switch (key) {
				case 1:
					System.out.print("\n\t\t\t\tEnter New User City      : ");
					newCity = Utility.stringScanner();
					arrayList.get(i).address.setCity(newCity);
					break;

				case 2:
					System.out.print("\n\t\t\t\tEnter New User State     : ");
					newState = Utility.stringScanner();
					arrayList.get(i).address.setState(newState);

					break;

				case 3:
					System.out.print("\n\t\t\t\tEnter New Zip Code       : ");
					newZip = Utility.integerScanner();
					arrayList.get(i).address.setPincode(newZip);

					break;

				case 4:
					System.out.print("\n\t\t\t\tEnter New User MobileNo  : ");
					newMobileno = Utility.stringScanner();
					arrayList.get(i).setMobile_number(newMobileno);
					break;

				default:
					System.out.print("\n\t\t\t\tInvalid Key ...Please Enter Valid Key");

				}
				
				System.out.println();
				System.out.println("List : " + arrayList);
				
			}
			else
			{
				System.out.println("Name not Found!!!!!");
			}
       return arrayList;
	}
     
    /**
     * Method to delete the Person from Addresss Book 
     * @param arrayList
     * @return
     * @throws IOException
     */
	public List<Person> delete(List<Person> arrayList) throws IOException 
	{
		System.out.println("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details!");
		System.out.println();
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = Utility.stringScanner();
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = Utility.stringScanner();

		/*
		 * Loop to find Person and then Remove that Person from Address Book if found
		 * else Person doesnot Exists in AddressBook
		 */
		for (int i = 0; i < arrayList.size(); i++) {
			if (firstName.equals(arrayList.get(i).getFirstname()) && lastName.equals(arrayList.get(i).getLastname())) {
			 	arrayList.remove(i);
			}
			else
			{
				System.out.println("Person Not Exists !!!!!!");
			}
		}
		System.out.println();
		System.out.println("List : " + arrayList);
		return arrayList;
	}

	/**
	 * Sort Method to Sort the AddressBook content like SortBY LastName of a Person and Sort BY ZipCode
	 * @param arrayList
	 * @return
	 * @throws IOException
	 */
	public List<Person> sort(List<Person> arrayList) throws IOException {
		System.out.println("\n\t\t\t\t         S O R T-M E N U");
		System.out.println("\t\t\t\t------------------------------");
		System.out.print("\n\t\t\t\tSort By LastName     : Enter 1");
		System.out.print("\n\t\t\t\tSort By ZipCode      : Enter 2");
		System.out.println();
		System.out.print("\n\t\t\t\tEnter the Choice : ");
		@SuppressWarnings("static-access")
		int choice = utility.integerScanner();
        /*
         * switch Case
         */
		switch (choice) {
		case 1:
			/*
			 * Method to Sort the Person By Name
			 */
			arrayList=sortByName(arrayList);
			System.out.println("\n\t\t\t\tSuccessfully Sort By LastName !");
			break;
		case 2:
			/*
			 * Method to Sort the Person by its Zipcode
			 */
			arrayList=sortByZip(arrayList);
			System.out.println("\n\t\t\t\tSuccessfully Sort By Zip  !");
			break;
		default:
			System.out.println("Invalid Choice...Please Enter the Correct Choice !");
		}

		return arrayList;
	}

	/**
	 * Method to Sort the Person By its Zipcode 
	 * @param arrayList
	 * @return
	 * @throws IOException
	 */
	private List<Person> sortByZip(List<Person> arrayList) throws IOException 
	{
		 /* Sorting on Rollno property*/
		   System.out.println("Sorting Accounting to Person ZipCode : ");
		   /*
		    * Collections.sort is an Inbuilt function 
		    */
		   Collections.sort(arrayList, Person.byZipComparator);
		   for(Person str: arrayList){
				System.out.println(str);
		   }

		return arrayList;
	}

	/**
	 * Method to Sort the Person By his Name 
	 * @param arrayList
	 * @return
	 */
	private List<Person> sortByName(List<Person> arrayList) 
	{
		 System.out.println("Sorting Accounting to Person Name : ");
		 /*
		  * Inbuilt Method to Sort 
		  */
		 Collections.sort(arrayList, Person.byNameComparator);

		   for(Person str: arrayList){
				System.out.println(str);
		   }
	     return arrayList;	  
	}

	
}
