/**
 * 
 */
package com.bridgelabz.model;

import java.util.Comparator;

/**
 * @author use
 *
 */
public class Person {
	public String firstname;
	public String lastname;
	public Address address;
	private String mobile_number;
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @return the mobile_number
	 */
	public String getMobile_number() {
		return mobile_number;
	}
	/**
	 * @param mobile_number the mobile_number to set
	 */
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Person(String firstname, String lastname, String mobile_number, Address address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile_number = mobile_number;
		this.address = address;
	}
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param object the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	public static Comparator<Person> byNameComparator = new Comparator<Person>()
	{
			@Override
			public int compare(Person p1, Person p2) {
				   String person1 = p1.getLastname().toUpperCase();
				   String person2 = p2.getLastname().toUpperCase();

				   //ascending order
				   return person1.compareTo(person2);

				   //descending order
				   //return StudentName2.compareTo(StudentName1);
			}
	};
	
	public static Comparator<Person> byZipComparator = new Comparator<Person>()
	 {
			@Override
			public int compare(Person p1, Person p2) {
				  int person1 = p1.address.getPincode();
				  int person2 = p2.address.getPincode();

				   /*For ascending order*/
				   return person1-person2;

				   /*For descending order*/
				   //rollno2-rollno1;
			}
	};

	@Override
	public String toString() {
		return "Person [firstName=" + firstname + ", lastName=" + lastname + ", address=" + address + ", mobileNo="
				+ mobile_number + "]";
	}
	
	

}
