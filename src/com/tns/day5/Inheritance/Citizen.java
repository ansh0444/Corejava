package com.tns.day5.Inheritance;

public class Citizen {
	private String name;
	private String addharNo;
	private long phNo;
	private String gender;
	private String tax;
	
	//create getter setter immediate after declaration
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddharNo() {
		return addharNo;
	}
	public void setAddharNo(String addharNo) {
		this.addharNo = addharNo;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String paytax() {
		return tax;
	}
	
	//para constructor
	public Citizen(String name, String addharNo, long phNo, String gender, String tax) {
		super();
		this.name = name;
		this.addharNo = addharNo;
		this.phNo = phNo;
		this.gender = gender;
		this.tax = tax;
	}
	
	//default const
	public Citizen() {
		System.out.println("default constructor");
	}
	//to string
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", addharNo=" + addharNo + ", phNo=" + phNo + ", gender=" + gender + ", tax="
				+ tax + "]";
	}
	
	
	
	
	
	
	
	
}
