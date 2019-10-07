package com.bridgelabz.functional;

public class prime {

	public static void main(String[] args) {
		int num = 1000,count = 0;
		for (int i = 1; i <num; i++) {
			
			for (int j = 2 ; j<i; j++) {

				if((i%j) == 0)
				{
					count = 0;
					break;
				}
				else {
					count = 1;
				}
								

			}	
			if(count == 1)
			System.out.println(i);
		}

	}

}
