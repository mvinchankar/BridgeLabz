package com.bridgelabz.adapterpattern;

public interface SocketAdapter
{
	public Volts get120Volt();
	public Volts get12volt();
	public Volts get3volt();
}