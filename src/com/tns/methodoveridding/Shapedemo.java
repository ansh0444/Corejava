package com.tns.methodoveridding;

public class Shapedemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating array of shape objects to store all the class in it.
		//2nd method for hierarchical calling /1st is loose coupling. 
		//loose coupling'
//		Shape sp;
//		sp=new Circle(23);
//		sp=new Square(23);
//		sp=new Triangle(2,5);
//		
		
		Shape[] sp=new Shape[3];
		sp[0]=new Circle(24);
		sp[1]=new Square(4);
		sp[2]=new Triangle(2,4);
		
		//now with the help of for loop we iterated through the arrays which contains classes
		
		for(Shape s:sp) {
			s.draw();
			s.erase();
		}
	}

}
