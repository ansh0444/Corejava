package com.tns.day4.accessmodifier2;

import com.tns.day4.accessmodifier.MyProfile;

public class MYpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyProfile obj1=MyProfile.getObject();
		
		obj1.name="Tony";
		obj1.Displayname();
		
		obj1.setAge(20);
		obj1.getAge();
		
		obj1.setBloodgroup("A+");
		obj1.getBloodgroup();
	
		obj1.display();
		
		obj1.showmobile();
		System.out.println(obj1);
		
		
		
	}

}
