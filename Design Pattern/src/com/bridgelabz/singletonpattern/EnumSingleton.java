package com.bridgelabz.singletonpattern;

public enum EnumSingleton {

    INSTANCE;
    
	public static EnumSingleton getInstance()
	{
		return EnumSingleton.INSTANCE;
	}
}
