package com.bridgelabz.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeePrototype implements Cloneable
{
	List<String> empList;
	public EmployeePrototype()
	{
		empList=new ArrayList<String>();
	}
	public EmployeePrototype(List<String> list)
	{
		this.empList=list;
	}
	public void loadData()
	{
		empList.add("Mangesh");
		empList.add("Akshay");
		empList.add("Suraj");
		empList.add("Divya");
	}
	public List<String> getEmpList()
	{
		return empList;
	}
	public Object clone() throws CloneNotSupportedException
	{
		List<String> temp=new ArrayList<String>();
		for(String s:this.empList)
		{
			temp.add(s);
		}
		return new EmployeePrototype(temp);	
	}
}
