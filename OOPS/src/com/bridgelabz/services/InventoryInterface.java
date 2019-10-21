/**
 * 
 */
package com.bridgelabz.services;

import java.util.List;

import com.bridgelabz.model.Inventory;



/**
 * @author use
 *
 */
public interface InventoryInterface {
	public List<Inventory> removeInventory(List<Inventory> inventoryList);
	public void display(List<Inventory> inventoryList);
	public  long totalPrice(List<Inventory> inventoryList);
	public  long totalWeight(List<Inventory> inventoryList);
	public  Inventory addInventory();
	
}
