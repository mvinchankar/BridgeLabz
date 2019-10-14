package com.bridgelabz.inventory.model;

import java.io.Serializable;

public class Inventory implements Serializable{

	private int price;
	private String name;
	private int weight;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
