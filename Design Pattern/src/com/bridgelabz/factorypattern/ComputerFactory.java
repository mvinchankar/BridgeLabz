package com.bridgelabz.factorypattern;

public class ComputerFactory 
{
	public Computer getInstance(String type)
	{
		if(type == null)
		{
			return null;
		}
		else if(type.equalsIgnoreCase("Pc"))
		{
			return new PC();
		}
		else if(type.equalsIgnoreCase("Server"))
		{
			return new Server();
		}
		else
		return null;
	}
}