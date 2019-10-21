package com.bridgelabz.inventory;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Inventory implements Serializable
{
	/**
	 * 
	 */
	private String name;
	private long weight;
	private long price;
	public Inventory()
	{
		
	}
	public Inventory(String name,long weight,long price)
	{
		super();
		this.name=name;
		this.weight=weight;
		this.price=price;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public long getWeight() 
	{
		return weight;
	}
	public void setWeight(long weight)
	{
		this.weight = (int) weight;
	}
	public long getPrice() 
	{
		return price;
	}
	public void setPrice(long price) 
	{
		this.price = (int) price;
	}

	@Override
	public String toString()
	{
		return "Inventory [name=" + name + ", weight=" + weight + ", Price=" + price + "]";
	}
	
	

}
