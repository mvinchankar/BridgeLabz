package com.bridgelabz.model;

public class Stocks{
	private String share_name;
	private long number_shares;
	private long price;
	/**
	 * @return the share_name
	 */
	public String getShare_name() {
		return share_name;
	}
	/**
	 * @param share_name the share_name to set
	 */
	public void setShare_name(String share_name) {
		this.share_name = share_name;
	}
	/**
	 * @return the number_shares
	 */
	public long getNumber_shares() {
		return number_shares;
	}
	/**
	 * @param number_shares the number_shares to set
	 */
	public void setNumber_shares(long number_shares) {
		this.number_shares = number_shares;
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
	@Override
	public String toString() 
	{
		return "Stocks [nameofstock=" + share_name + ", number_shares=" + number_shares + ", price=" + price + "]";
	}


	

}
