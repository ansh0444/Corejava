
package com.tns.constructor;

public class Customer {
	private String name;
	private int id;
	private String city;
	
	//default constructor
	Customer() {
		System.out.println("Default constructor");
		name = "ansh";
		id=10;
		city = "Dombivli";
	}

	//by default it creates superclass ka object!!
	//para. constructor
	public Customer(String name, int id, String city) {
		this();//to call deaf const.
		this.name = name;
		this.id = id;
		this.city = city;
		//this();//Compile time error.(always place at start.)
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	//to make it more readable we will use toString() from obj class.
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

	

}
