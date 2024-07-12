package com.tns.methodoveridding;

public class Triangle extends Shape{

	private int base;
	private int height;
	
	//constructor
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the triangle with base "+base+" and height "+height);
	}
	
	public void erase() {
		System.out.println("Erasing the triangle with base "+base+" and height "+height);
	}
}
