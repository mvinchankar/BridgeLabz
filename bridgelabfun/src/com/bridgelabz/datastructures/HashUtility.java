package com.bridgelabz.datastructures;


	class HashNode
	{
	    HashNode next;
	    int data;
	 
	    /* Constructor */
	    public HashNode(int x)
	    {
	        data = x;
	        next = null;
	    }
	}
	 
	
	public class HashUtility
	{
	    private HashNode[] table = new HashNode[11];
	    private int size =11;
	 
	    /* Constructor */
	    
	    /* Function to check if hash table is empty */
	    public boolean isEmpty()
	    {
	        return size == 0;
	    }
	    /* Function to clear hash table */
	    public void makeEmpty()
	    {
	        int l = table.length;
	        table = new HashNode[l];
	        size = 0;
	    }
	    /* Function to get size */
	    public int getSize()
	    {
	        return size;
	    }
	    /* Function to insert an element */
	    public void insert(int val)
	    {
	        size++;
	        int pos = myhash(val);        
	        HashNode pointtonode = new HashNode(val);                
	        if (table[pos] == null)
	            table[pos] = pointtonode;            
	        else
	        {
	            pointtonode.next = table[pos];
	            table[pos] = pointtonode;
	        }    
	    }
	    /* Function to remove an element */
	    public void remove(int val)
	    {
	        int pos = myhash(val);    
	        HashNode start = table[pos];
	        HashNode end = start;
	        if (start.data == val)
	        {
	            size--;
	            table[pos] = start.next;
	            return;
	        }
	        while (end.next != null && end.next.data != val)
	            end = end.next;
	        if (end.next == null)
	        {
	            System.out.println("\nElement not found\n");
	            return;
	        }
	        size--;
	        if (end.next.next == null)
	        {
	            end.next = null;
	            return;
	        }
	        end.next = end.next.next;
	        table[pos] = start;
	    }
	    /* Function myhash */
	    private int myhash(Integer x )
	    {
	        int hashVal = x.hashCode( );
	        hashVal %= 11;
	        if (hashVal < 0)
	            hashVal += table.length;
	        return hashVal;
	    }
	    public void printHashTable ()
	    {
	        System.out.println();
	        for (int i = 0; i < 11; i++)
	        {
	            System.out.print ("Bucket " + i + ":  ");             
	            HashNode start = table[i];
	            while(start != null)
	            {
	                System.out.print(start.data +" ");
	                start = start.next;
	            }
	            System.out.println();
	        }
	    }   
	    /* Function to generate next prime number >= n */
	   
}
