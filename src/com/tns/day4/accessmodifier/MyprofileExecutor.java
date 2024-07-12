package com.tns.day4.accessmodifier;

public class MyprofileExecutor {
	 
	public static void main(String[] args) {
		MyProfile p = MyProfile.getObject();
		p.name="Ansh";
		p.Displayname();
		
		//so privates are not visible in default constructor
		p.setAge(56);
		p.getAge();
		
		//default can be accesssible
		p.mobileno=1234233233;
		p.mobile();
		
		p.email="ansh@gmail.com";
		p.showEmail();
		
		//private hai bloodgroup
		p.setBloodgroup("A+");
		p.getBloodgroup();
		
		
		
		System.out.println(p);
		
		
		
		
	}
}
