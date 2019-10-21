package com.bridgelabz.model;

public class Address {
	public String state;
	public String city;
	public int pincode;
	
	public Address(String state, String city, int pincode) {

		this.city = city;
		this.state = state;
		this.pincode = pincode;

	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() 
	{
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	

}
