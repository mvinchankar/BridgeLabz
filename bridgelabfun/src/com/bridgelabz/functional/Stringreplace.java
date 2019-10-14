package com.bridgelabz.functional;
import java.util.Scanner;
/**
 * String Replace
 * @author admin1
 *
 */
public class Stringreplace {
  public static void main(String[] args) {
		String str= "Hello <<UserName>>, How are you?";
		System.out.println(str.replaceAll("<<UserName>>",FunctionalUtility.accept()));        
	    /**
	     * String.replaceAll method to change username with valid name
	     */
  }

}
