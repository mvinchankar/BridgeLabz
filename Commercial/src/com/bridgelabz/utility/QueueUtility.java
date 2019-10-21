package com.bridgelabz.utility;

public class QueueUtility<T> 
{

	class node<T>
	{
		T data;
		node next;
	}
	
	node front;

	public void enqueue(T item)
	{
		node newNode = new node();
		newNode.data = item;
		newNode.next = null;
		
		if(front == null)
		{
			front = newNode;
		}
		else
		{
			node traversingNode;
			traversingNode = front;
			while(traversingNode.next != null)
			{
				traversingNode = traversingNode.next;	
			}
			traversingNode.next = newNode;
		}
	}
	
	public void dequeue()
	{
		front = front.next;
	}
	
	
	public boolean isEmpty()
	{
		if(front == null)
		{
		return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public int size()
	{
		
		int counter=0;
		node traversingNode = front;
		while(traversingNode != null)
		{
			counter++;
			traversingNode = traversingNode.next;
		}
		//counter++;
		return counter;			
		
	}
	
	public void showFullQueue()
	{
		node traversingNode;
		try
		{
			traversingNode = front;
			System.out.print(front.data+"  ");
			while(traversingNode.next != null)
			{
				
				traversingNode = traversingNode.next;
				System.out.print(traversingNode.data+"  ");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Queue is empty");
		}
		
	}
	

}