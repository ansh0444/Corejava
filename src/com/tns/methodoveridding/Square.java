package com.tns.methodoveridding;

public class Square extends Shape{

	private int side;
	
	//constructor
	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the square with side "+side);
	}
	
	public void erase() {
		System.out.println("Erasing the square with side "+side);
	}

}
