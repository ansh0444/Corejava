package com.tns.abstraction;

public class square extends Shapes{

	private double side;
	
	
	public square( double side) {
		super();
		this.side = side;
	}
	
	public double calArea() {
		return this.area=side*side;
	}
}
