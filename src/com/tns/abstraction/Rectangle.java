package com.tns.abstraction;

public class Rectangle extends Shapes{

	private double length;
	private double breadth;
	
	public double calArea() {
		return this.area =length*breadth;
	}

	public Rectangle( double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
}
