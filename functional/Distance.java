package com.bridgelabz.functional;

public class Distance {

	public static void calculateEuclideanDistance()
	{
		System.out.println("Enter the X-Coordinate :");
		int xcoordinate  = Utility.integerScanner();
		System.out.println("Enter the Y-Coordinate :");
		int ycoordinate = Utility.integerScanner();
		
		int value = (xcoordinate * xcoordinate) + (ycoordinate * ycoordinate);
		//System.out.println(value);
		double distance = (double)Math.sqrt(value);
		System.out.println("Euclidean Distance between the (X,Y) and the Origin is : "+"\n"+distance);
	}
	public static void main(String[] args) {
		
		System.out.println("To find the Euclidean Distance between (X,Y) and the Origin :");
        Distance d = new Distance();
        d.calculateEuclideanDistance();
	}

}
