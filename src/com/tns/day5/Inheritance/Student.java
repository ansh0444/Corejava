package com.tns.day5.Inheritance;

public class Student extends Citizen {

	private int id;
	private String collegename;
	private String branch;
	private String study;
	
	//getter setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	//method
	public String isStudying() {
		return study;
	}
	//default class
	public Student() {
		super();
	}
	//para const and inherit para const of citizen
	public Student(String name, String addharNo, long phNo, String gender, String tax, int id, String collegename,
			String branch, String study) {
		super(name, addharNo, phNo, gender, tax);
		this.id = id;
		this.collegename = collegename;
		this.branch = branch;
		this.study = study;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", collegename=" + collegename + ", branch=" + branch + ", study=" + study
				+ ", getName()=" + getName() + ", getAddharNo()=" + getAddharNo() + ", getPhNo()=" + getPhNo()
				+ ", getGender()=" + getGender() + ", paytax()=" + paytax() + "]";
	}
	
	
	
	
	
	
	
	
}
