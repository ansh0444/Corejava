package com.tns.methodoveridding;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Drawing the circle with radius "+radius);
	}
	
	public void erase() {
		System.out.println("Erasing radius of circle "+radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
