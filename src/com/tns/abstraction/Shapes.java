package com.tns.abstraction;

public abstract class Shapes {

	//will create common method.
	public double area;
	
	
	//solid method.
	public void showArea() {
		System.out.println("The area of the shape "+area);
	}
	
	//creating the abstract method.
	public abstract double calArea();
	
}
