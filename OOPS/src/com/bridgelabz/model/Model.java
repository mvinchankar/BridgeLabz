package com.bridgelabz.model;

import java.util.List;

public class Model 
{
	List<Rice> rice;
	List<Wheat> wheat;
	List<Pulses> pulse;
	public List<Rice> getRice() 
	{
		return rice;
	}
	public void setRice(List<Rice> rice) 
	{
		this.rice = rice;
	}
	public List<Wheat> getWheat() 
	{
		return wheat;
	}
	public void setWheat(List<Wheat> wheat) 
	{
		this.wheat = wheat;
	}
	public List<Pulses> getPulse() 
	{
		return pulse;
	}
	public void setPulse(List<Pulses> pulse) 
	{
		this.pulse = pulse;
	}
	@Override
	public String toString() 
	{
		return "InventoryModel [rice=" + rice + ", wheat=" + wheat + ", pulse=" + pulse + "]";
	}
	

}
