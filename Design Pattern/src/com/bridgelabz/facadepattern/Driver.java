package com.bridgelabz.facadepattern;

public class Driver {

	public static void main(String[] args) 
	{
		ShapeMaker shapeMaker=new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
