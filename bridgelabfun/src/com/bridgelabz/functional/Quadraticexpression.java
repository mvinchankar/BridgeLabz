package com.bridgelabz.functional;
import java.util.Scanner;
public class Quadraticexpression {
/**
 * Driver method to find the quadratic equation 
 * @param args
 */
	public static void main(String[] args) {
		double a, b, c;
		System.out.println("Enter the values of a, b, c respectively :");
		a = FunctionalUtility.doubleScanner();
		b = FunctionalUtility.doubleScanner();
        c = FunctionalUtility.doubleScanner();

        double root1 = 0, root2 = 0;
        FunctionalUtility.rootsofEquation(a, b, c, root1, root2);
	}
        
}
