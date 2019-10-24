package com.bridgelabz.model;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Inventory implements Serializable
{
	
	private String name;
	private long weight;
	private long price;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the weight
	 */
	public long getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(long weight) {
		this.weight = weight;
	}
	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}
	public Inventory()
	{
		
	}
	/**
	 * Contructor with Multiple arguments
	 */
	public Inventory(String name,long weight,long price)
	{
		super();
		this.name=name;
		this.weight=weight;
		this.price=price;
	}
	
	
	@Override
	public String toString()
	{
		return "Inventory [name=" + name + ", weight=" + weight + ", Price=" + price + "]";
	}
	
	

}
