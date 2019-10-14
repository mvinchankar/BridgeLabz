package com.bridgelabz.datastructures;
	
public class GenericUtility<T> {
/**
 *Creation of node using Node class 
 * @param <T>
 */
class Node<T>
{
	T data;
	Node next;
}
Node head;

/**
 * addElement is a method for adding the elements in a linked lists
 * @param data
 */
public void addelement(T data)
{
	Node<T> newnode = new Node();
	newnode.data = data;                                    //adding node
    newnode.next = null;

    if(head == null)
    {
     head= newnode;
     // System.out.println(head.data);
	}
	else
	{
		Node TraversingNode = head;
		while(TraversingNode.next != null)
		{
			TraversingNode = TraversingNode.next;           //traverse till last node
		}
		TraversingNode.next = newnode;                      //add element to last

	}
}

/**
 * search the element method to search an particular element in linked list
 * @param key
 */
public void search(int key)
{
   Node<Integer> node = head;
   int flag =0,i =0,index;
   while (node.next !=null) 
   {
	if(node.data==(key))
	{
		flag =1;
		index =i;
		System.out.println("Found at" + index);
		
	}
	node = node.next;
	i++;
}
 while(node.next == null)
 {
	if(node.data==(key))
	{
		System.out.println("Found at last");
		break;
	}
 else
 {
	 System.out.println("Not Found");
	 }
 }
}

/**
 * Remove method to remove an element from linked lists
 * @param key
 */
public void remove(int key)
{
	Node temp = head;

	if(key==0)                                           //element removed at first position
	{
		head =temp.next;
		System.out.println("Found and deleted :" + key);
	    return;
	}
    for (int i=0; temp!=null && i<key-1; i++)  
    temp = temp.next;                                    //element removed at last position
    System.out.println("Found and Deleted");
    if (temp == null || temp.next == null) 
	    return; 
		 
    Node next = temp.next.next; 
        temp.next = next;                                //remove the element
	
}






public void print()
{
	Node node = head;
	while(node !=null)
	{
		System.out.println(node.data);
		node = node.next;
	}
	/* while(fileinput.hasNextInt())
 {
	 util.addelement(fileinput.nextInt());
 }*/



}

 public void sortList() {  
        //Node current will point to head  
 Node current = head, index = null;  
 String temp;
  
 if(head == null) {  
    return;  
 }  
 else {  
   while(current != null) 
   {  
        //node index point to current.next  
      index = current.next;  
      while(index != null) 
      {  
      //If current node data is greater than index node data, swap the data between them  
        if((current.data.toString()).compareTo(index.data.toString())>0) {  
            temp = current.data.toString();  
            current.data = index.data;  
            index.data = temp;  
        }  
        index = index.next;  
      }  
        current = current.next;  
    }      
    
  }  

 }  

}