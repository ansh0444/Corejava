package com.tns.methodoverloading;

public class Operationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op=new Operation();
		
		boolean result=op.ispalindrome(121);
		System.out.println(result);
		
		 result=op.ispalindrome("ansh");
		System.out.println(result);
		
		result=op.ispalindrome(12321);
		System.out.println(result);
		
		pointers po=new pointers();
		System.out.println(po);
		
		po=new pointers(34);
		System.out.println(po);
		
		po=new pointers(23,45);
		System.out.println(po);
	}
}
