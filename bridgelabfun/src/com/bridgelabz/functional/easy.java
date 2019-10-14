package com.bridgelabz.functional;

public class easy {

	public static void main(String[] args) {
		int size = FunctionalUtility.integerScanner();
		int max =0;
		int [] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = FunctionalUtility.integerScanner();
		}
		for (int i = 0; i < num.length; i++) {
			if(max<num[i])
			{
				max = num[i];
			if(max>num[i])
			{
				System.out.println(" ad");
			}
			else
			{
				System.out.println(max);
			}
			
		}

	}

}
}
