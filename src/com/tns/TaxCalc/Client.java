package com.tns.TaxCalc;
import java.util.*;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		System.out.println("Enter the income");{
		double income=sc.nextDouble();
		
		System.out.println("Enter the gender");
		String gender = sc.next();
		
		
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		p.setIncome(income);
		p.setGender(gender);
		
		TaxCalculation taxx = new TaxCalculation();
		taxx.calculator(p);
		}
	}

}
