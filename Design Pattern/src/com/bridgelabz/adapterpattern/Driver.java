package com.bridgelabz.adapterpattern;

public class Driver {

	
	public static void main(String[] args)
	{
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter()
	{
		SocketAdapter socketAdapter=new SocketObjectAdapter();
		Volts v3=getVolts(socketAdapter,3);	
		Volts v12=getVolts(socketAdapter, 12);
		Volts v120=getVolts(socketAdapter, 120);
		System.out.println("Volt :"+v3.getVolts());
		System.out.println("Volt1 : "+v12.getVolts());
		System.out.println("Volt2 : "+v120.getVolts());
	}
	private static void testClassAdapter() 
	{
		SocketAdapter socketAdapter=new SocketClassAdapter();
		Volts v3=getVolts(socketAdapter,3);	
		Volts v12=getVolts(socketAdapter, 12);
		Volts v120=getVolts(socketAdapter, 120);
		System.out.println("Volt :"+v3.getVolts());
		System.out.println("Volt1 : "+v12.getVolts());
		System.out.println("Volt2 : "+v120.getVolts());		
	}
	private static Volts getVolts(SocketAdapter socketAdapter, int i) 
	{
		switch(i)
		{
		case 3:return socketAdapter.get3volt();
		case 12: return socketAdapter.get12volt();
		case 120:return socketAdapter.get120Volt();
		default: return socketAdapter.get120Volt();
		}
	}
}
