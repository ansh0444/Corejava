package com.tns.finalkey;

public class FinalVariable {

	//final int x=;//final var should be initialize at the time of declaration.
	
	final static int x;//value is not initialize
	
	final static int y=89;
	
	//block
	static {
		System.out.println("In static block");
		x=80;//now x is initialize and static is exucuted before main method.
	}
	
	//static method
	
	static void show() {
		System.out.println("x is "+x);
		System.out.println("y is "+y);
	}
}
