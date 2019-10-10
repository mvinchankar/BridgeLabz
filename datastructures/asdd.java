package com.bridgelabz.datastructures;
public class asdd {
static assd stack = new assd();

public static void main(String[] args)
{
String paranthesis="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
System.out.println("Given equation is  "+paranthesis);
char opening='(';
char closing=')';

for (int i = 0; i < paranthesis.length(); i++) {
{
char symbol=paranthesis.charAt(i);
if(symbol==opening)
{	
stack.push(opening);
}
if(symbol==closing)
{	
stack.pop(opening);
}
}
if(assd.size()>0)
System.out.println("Paranthesis is Unbalanced");
if(assd.size()<=0)
System.out.println("Paranthesis is Unbalanced");
}

}

}