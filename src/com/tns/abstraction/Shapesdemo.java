package com.tns.abstraction;

public class Shapesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s;
		
		s=new Circle(2);
		s.calArea();
		s.showArea();
		
		s=new square(4);
		s.calArea();
		s.showArea();
		
		s=new Rectangle(2,4);
		s.calArea();
		s.showArea();
	}

}
