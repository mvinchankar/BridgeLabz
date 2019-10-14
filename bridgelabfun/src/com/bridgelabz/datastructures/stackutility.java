
package com.bridgelabz.datastructures;


class node<T>
{
	T data;
	node next;
}

public class stackutility<T>
{
	node<T> head;
	
//	public node<T> stack()
//	{
//		node newNode = new node();
//		return newNode;
//	}
	
	
	
	public void push(T data)
	{
		node<T> newNode = new node();
		newNode.data = data;
		newNode.next = null;

		newNode.next = head;
		head = newNode;

	}
	
	public node pop()
	{
		node previous = null;
		try
		{
			previous = head;
			head = head.next;
		}
		catch(NullPointerException e)
		{
			System.out.println("Stack is Empty");
		}
		return previous;
	}
	
	
	public Object peek()
	{
		return head.data;
	}
	
	
	public int size()
	{
		int counter=0;
		node traversingNode = head;
		while(traversingNode.next != null)
		{
			counter++;
			traversingNode = traversingNode.next;
		}
		counter++;
		return counter;			
	}
	
	public boolean isEmpty()
	{
		if(head == null)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void showFullStack()
	{
		node traversingNode;
		try
		{
			traversingNode = head;
			System.out.println(head.data);
			while(traversingNode.next != null)
			{
				
				traversingNode = traversingNode.next;
				System.out.println(traversingNode.data+"");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Stack is empty");
		}
		
	}
}
