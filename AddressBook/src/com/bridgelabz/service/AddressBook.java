package com.bridgelabz.service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.Person;
import com.bridgelabz.utility.Utility;

public class AddressBook
{
	AddressBookManagement addressManager = new AddressBookManagement();
	String filePath = "";
	private Utility utility = new Utility();
	Address address = new Address();
	
	
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
		//System.out.print("\t\t\t\tEnter the Address    : ");
//		String address = utility.stringScanner();
//		person.setAddress(address);
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
		//System.out.println("List : "+arrayList);
		
		return arrayList;
	}

	public List<Person> edit(List<Person> arrayList) throws IOException {
		System.out.println("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details!");
		System.out.println();
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = Utility.stringScanner();
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = Utility.stringScanner();

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

//				case 1:
//					System.out.print("\n\t\t\t\tEnter New User Address   : ");
//					newAddress = utility.stringScanner();
//					arrayList.get(i).setAddress(newAddress);
//
//					break;

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
       return arrayList;
	}

	public List<Person> delete(List<Person> arrayList) throws IOException 
	{
		System.out.println("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details!");
		System.out.println();
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = Utility.stringScanner();
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = Utility.stringScanner();

		for (int i = 0; i < arrayList.size(); i++) {
			if (firstName.equals(arrayList.get(i).getFirstname()) && lastName.equals(arrayList.get(i).getLastname())) {
			 	arrayList.remove(i);
			}
		}
		System.out.println();
		System.out.println("List : " + arrayList);
		return arrayList;
	}

	public List<Person> sort(List<Person> arrayList) throws IOException {
		System.out.println("\n\t\t\t\t         S O R T-M E N U");
		System.out.println("\t\t\t\t------------------------------");
		System.out.print("\n\t\t\t\tSort By LastName     : Enter 1");
		System.out.print("\n\t\t\t\tSort By ZipCode      : Enter 2");
		System.out.println();
		System.out.print("\n\t\t\t\tEnter the Choice : ");
		int choice = utility.integerScanner();

		switch (choice) {
		case 1:
			arrayList=sortByName(arrayList);
			System.out.println("\n\t\t\t\tSuccessfully Sort By LastName !");
			break;
		case 2:
			arrayList=sortByZip(arrayList);
			System.out.println("\n\t\t\t\tSuccessfully Sort By Zip  !");
			break;
		default:
			System.out.println("Invalid Choice...Please Enter the Correct Choice !");
		}

		return arrayList;
	}

	private List<Person> sortByZip(List<Person> arrayList) throws IOException 
	{
		 /* Sorting on Rollno property*/
		   System.out.println("Sorting Accounting to Person ZipCode : ");
		   Collections.sort(arrayList, Person.byZipComparator);
		   for(Person str: arrayList){
				System.out.println(str);
		   }

		return arrayList;
	}

	private List<Person> sortByName(List<Person> arrayList) 
	{
		 System.out.println("Sorting Accounting to Person Name : ");
		 Collections.sort(arrayList, Person.byNameComparator);

		   for(Person str: arrayList){
				System.out.println(str);
		   }
	     return arrayList;	  
	}

	
}
