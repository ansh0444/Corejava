package com.tns.constructor;
import java.util.*;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default const
		
		Customer cl = new Customer();
//		System.out.println(cl.getCity());
//		System.out.println(cl.getId());
//		System.out.println(cl.getName());
		System.out.println(cl);
//		
		cl.setCity("Pune");
		cl.setId(20);
		cl.setName("Rohan");
//		
//		System.out.println(cl.getCity());
//		System.out.println(cl.getId());
//		System.out.println(cl.getName());
		
		System.out.println(cl);
		
		//para.constructor more optimize
		
		Customer c2 = new Customer("shiv",100,"kashi");
		System.out.println(c2);
		
		//lets ask from user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		
		System.out.println("Enter your city:");
		String city=sc.next();
		
		Customer c3 = new Customer(name,id,city);
		System.out.println(c3);

	}

}
