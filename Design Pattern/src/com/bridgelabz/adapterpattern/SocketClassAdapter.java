package com.bridgelabz.adapterpattern;

public class SocketClassAdapter extends Socket implements SocketAdapter
{
	public Volts get120Volt() 
	{
		return getVolt();
	}
	public Volts get12volt() 
	{
		Volts v=getVolt();
		return convertVolt(v,10);
	}	
	public Volts get3volt() 
	{
		Volts v=getVolt();
		return convertVolt(v, 40);
	}
	private Volts convertVolt(Volts v, int i) 
	{
		return new  Volts(v.getVolts()/i);
	}
}