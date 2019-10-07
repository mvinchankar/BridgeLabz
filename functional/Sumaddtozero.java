package com.bridgelabz.functional;

public class Sumaddtozero {

	
	public static void main(String[] args) {
		
        System.out.println("Length");
		int length = Utility.integerScanner();
		int [] array = {1,4,7,2,8,-4,-7,-1,6,9,0,-3};
//		for (int i = 0; i < length; i++) {
//			array[i] = Utility.integerScanner();
//		
//		}
		Utility.distinctTriplets(length, array);

	}

}
