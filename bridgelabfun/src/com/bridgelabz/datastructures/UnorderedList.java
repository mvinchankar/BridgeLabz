package com.bridgelabz.datastructures;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import com.bridgelabz.algorithmprograms.Utility;

/**
 * Node creation class of type Generic
 * @param <T>
 */
class Node<T>
{
	T data;
	Node next;
}

public class UnorderedList<T> {

	Node head ;
	
public static void main(String[] args) throws IOException {
  int count =0,flag =1;
  UnorderedList<String> t =new UnorderedList<String>();
  GenericUtility<String> util = new GenericUtility<String>();
  String userinput;
  File file=new File("/home/admin1/Desktop/aa");     
  /*
   * Scan the elements in a file using delimiter ","         
   */
  Scanner fileinput=new Scanner(file).useDelimiter(",");      
  String line = " ";
  while(fileinput.hasNext())
  {
	 line = fileinput.next();  
	 /*
	  * add the elements in linked list
	  */
	 util.addelement(line);                                   
  }
  /*
   * print the elements 
   */
  util.print();                                                
  System.out.println("Enter string to search :");
  userinput = Utility.stringScanner();
  com.bridgelabz.datastructures.GenericUtility.Node traversingNode = util.head;
 
  while((traversingNode) !=null)       
  {
	 if(traversingNode.data.equals(userinput))
	 {
		 /*
		  * remove the element if found
		  */
		 util.remove(count);                                   
		 flag =0;
	 }
	 traversingNode= traversingNode.next;
	 count++;
  }
 
  if(flag==1)
  {
	  /*
	   * if not found addelement using addelement method 
	   */
	 util.addelement(userinput);                               
  }
 
  Writer writer = new PrintWriter("/home/admin1/Desktop/output");
  com.bridgelabz.datastructures.GenericUtility.Node traversingNode1 =util.head;
  while((traversingNode1.next)!=null && (traversingNode1.data) !=null)
  {
	 writer.write(traversingNode1.data +"\n");
	 /*
	  * traverse the node 
	  */
	 traversingNode1 = traversingNode1.next;            
	 
  }
  /*
   * write the linked list in a file  
   */
  writer.write(traversingNode1.data+"");                
	 writer.close();
	 
	 
	 
	}
}



