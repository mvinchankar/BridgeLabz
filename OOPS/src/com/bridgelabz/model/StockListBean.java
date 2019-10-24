package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class StockListBean implements Serializable{
	
	private List<ShareBean> stockList;

	/**
	 * @return the stockList
	 */
	public List<ShareBean> getStockList() {
		return stockList;
	}

	/**
	 * @param stockList the stockList to set
	 */
	public void setStockList(List<ShareBean> stockList) {
		this.stockList = stockList;
	}
	
	
	

}
