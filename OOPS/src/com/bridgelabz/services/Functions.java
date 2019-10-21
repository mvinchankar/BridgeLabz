package com.bridgelabz.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.model.Inventory;
import com.bridgelabz.utility.OOPUtility;
public class Functions implements InventoryInterface{
	

	/* 
	 * Purpose : Adding information of inventory products and returns inventory
	 * object after adding data into it. 
	 */
	public Inventory addInventory()
	{
		Inventory inventory=new Inventory();
		OOPUtility.stringScanner();
		System.out.println("Enter product name ");
        inventory.setName(OOPUtility.stringScanner()); 	
        System.out.println("Enter Product Weight "+inventory.getName());
        inventory.setWeight(OOPUtility.longScanner()); 
        System.out.println("Enter Price of per product "+inventory.getName());
        inventory.setPrice(OOPUtility.longScanner());
        return inventory;
	}
	
	
	/*
	 * Purpose : Calculating total weight of all the products in the inventory
	 * and returns the calculated weight
	 */
	public long totalWeight(List<Inventory> inventoryList)
	{
		long totalWeight = 0;
		for(Inventory inventory : inventoryList)
		{
			totalWeight=totalWeight+inventory.getWeight();
		}
		return totalWeight;
	}
	
	

	/*
	 * Purpose : Calculating total price of all the products in the inventory
	 * and returns the calculated total price
	 */
	public long totalPrice(List<Inventory> inventoryList)
	{
		long totalPrice = 0;
		for(Inventory inventory : inventoryList) 
		{
			totalPrice = totalPrice+(inventory.getPrice()*inventory.getWeight());
		}
		return totalPrice;
	}
	
	

	/* 
	 * Purpose : Displaying all the products in the inventory
	 */
	public void display(List<Inventory> inventoryList) 
	{
		System.out.println();
		for(Inventory inventory : inventoryList) 
		{
			System.out.println(inventory.toString());
		}
		
	}
	
	/* 
	 * Purpose : Removing and product from the inventory 
	 */
	public List<Inventory> removeInventory(List<Inventory> inventoryList) 
	{
		System.out.println("\nEnter the name which you want to remove");
		String name = OOPUtility.stringScanner();
		int count = 0;
		List<Inventory> list = new ArrayList<>();
		for(Inventory inventory : inventoryList) 
		{
			if(name.equals(inventory.getName())) 
			{
				list.add(inventory);
				count++;
				System.out.println("\nRmoved");
			}
		}
		inventoryList.removeAll(list);
		if(count==0) 
		{
			System.out.println("\nNo such data found");
		}
		return inventoryList;
	}

}
