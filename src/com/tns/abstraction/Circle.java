package com.tns.abstraction;

public class Circle extends Shapes {

	private double radius;

	//para constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
 
	public double calArea() {
		return this.area=3.14*radius*radius;
	}
}

//Interface in java is a blueprint of classs.

