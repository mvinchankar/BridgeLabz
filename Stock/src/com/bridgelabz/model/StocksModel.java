package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class StocksModel implements Serializable{
	
	List<Stocks> stock;

	/**
	 * @return the stock
	 */
	public List<Stocks> getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(List<Stocks> stock) {
		this.stock = stock;
	}
	@Override 
	public String toString()
	{
		return "StockModel[stock1="+stock+"]";
	}

}
