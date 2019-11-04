package com.bridgelabz.facadepattern;

public class ShapeMaker
{
	private Shape Circle;
	private Shape Rectangle;
	private Shape Square;
	
	public ShapeMaker()
	{
		Circle=new Circle();
		Rectangle=new Rectangle();
		Square=new Square();
	}
	public void drawCircle()
	{
		Circle.draw();
	}
	public void drawRectangle()
	{
		Rectangle.draw();
	}
	public void drawSquare()
	{
		Square.draw();
	}
}