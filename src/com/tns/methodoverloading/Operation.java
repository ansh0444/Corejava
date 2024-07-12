package com.tns.methodoverloading;

public class Operation {

	//method-1
	public static boolean ispalindrome(int num) {
		int rev=0;
		int dummynumber=num;
		while(num!=0) {
			rev=rev*10 + num%10;
			num/=10;
		}return rev==dummynumber;
	}
	
	//method-2
	public static boolean ispalindrome(String name) {
		String str;
		str=new StringBuffer(name).reverse().toString();
		return name.equals(str);
	}
}
