package com.tns.constructor;

import cns.tns.privateconsdemo.MyClass;

public class MyClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyClass ka obj return karega
		//n noof obj you can create it is pointing to same obj.
		
		MyClass obj1 = MyClass.getObject();
		obj1.setId(10);
		System.out.println(obj1);
		
		MyClass m = MyClass.getObject();
		System.out.println(m);
	}

}
