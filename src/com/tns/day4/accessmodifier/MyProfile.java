package com.tns.day4.accessmodifier;

public class MyProfile {
	public String name;
	private int age;
	private String Bloodgroup;
	protected String email;
	int mobileno;
	
	//private obj;
	private static MyProfile obj = new MyProfile();
	

	//default cons
	
	
	//constructor
	 private MyProfile() {
		 System.out.println("Private constructor");
	}
	 
	 //methods
	 public String Displayname() {
		 return name;
	 }
	 
	 private int showage() {
		 return age;
	 }
	 
	 private String toBloodgp() {
		 return Bloodgroup;
	 }
	 
	 protected String showEmail() {
		 return email;
	 }
	
	 int mobile() {
		 return mobileno;
	 }

	//getter setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodgroup() {
		return Bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		Bloodgroup = bloodgroup;
	}
	
	public void display() {
		email="anshgupta@gmail.com";
		showEmail();
	}
	public void showmobile() {
		mobileno=989245514;
		mobile();
	}
	
	//factory method  
	public static MyProfile getObject() {
		return obj;
	}
	@Override
	public String toString() {
		return "MyProfile [name=" + name + ", age=" + age + ", Bloodgroup=" + Bloodgroup + ", email=" + email
				+ ", mobileno=" + mobileno + "]";
	}
	
	
	
}
