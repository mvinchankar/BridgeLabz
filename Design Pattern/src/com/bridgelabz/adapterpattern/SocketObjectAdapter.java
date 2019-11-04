package com.bridgelabz.adapterpattern;

public class SocketObjectAdapter implements SocketAdapter
{
	private Socket socket=new Socket();
	public Volts get120Volt() 
	{
		return socket.getVolt();
	}
	public Volts get12volt()
	{
		Volts v=socket.getVolt();
		return convertVolt(v,10);
	}
	public Volts get3volt() 
	{
		Volts v=socket.getVolt();
		return convertVolt(v, 40);
	}
	private Volts convertVolt(Volts v, int i) 
	{
		return new Volts(v.getVolts()/i);
	}
}