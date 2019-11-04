package com.bridgelabz.singletonpattern;



public class Driver {

	public static void main(String[] args) 
	{
		EagerInitialization obj1 = EagerInitialization.getInstance();
		EagerInitialization obj2 = EagerInitialization.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
//		StaticBlock obj1 = StaticBlock.getInstance();
//		StaticBlock obj2 = StaticBlock.getInstance();
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());

//		LazyInitialization obj1 = LazyInitialization.getInstance();
//		LazyInitialization obj2 = LazyInitialization.getInstance();
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
//		ThreadSafe obj1 = ThreadSafe.getInstance();
//		ThreadSafe obj2 = ThreadSafe.getInstance();
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
//		BillPough obj1 = BillPough.getInstance();
//		BillPough obj2 = BillPough.getInstance();
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
//		EnumSingleton obj1 = EnumSingleton.getInstance();
//		EnumSingleton obj2 = EnumSingleton.getInstance();
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
	}

}
