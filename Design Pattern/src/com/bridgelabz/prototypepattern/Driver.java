package com.bridgelabz.prototypepattern;

import java.util.List;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		EmployeePrototype emp=new EmployeePrototype();
		emp.loadData();
		EmployeePrototype emp1=(EmployeePrototype)emp.clone();
		EmployeePrototype emp2=(EmployeePrototype)emp.clone();
		List<String> list=emp1.getEmpList();
		list.add("Akash");
		List<String> list1=emp2.getEmpList();
		list1.remove("Mangesh");
		System.out.println("Employee : "+emp.getEmpList());
		System.out.println("Employee 1 : "+list);
		System.out.println("Employee 2 : "+list1);
	}
}
