package com.bridgelabz.functional;
import java.util.Scanner;
public class Stringreplace {

	Utility util = new Utility();
	
	public String accept(){
		
		System.out.println("Enter the Username :");
		String name = util.stringScanner();
		return name;
	}
	public static void main(String[] args) {
		Stringreplace f=new Stringreplace();
		
		String str= "Hello <<UserName>>, How are you?";
		System.out.println(str.replaceAll("<<UserName>>",f.accept()));
	}

}
