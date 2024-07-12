package com.tns.methodoverloading;

public class pointers {

	int i;
	int j;
	
	public pointers() {
		this.i=0;
		this.j=0;
	}
	
	public pointers(int i) {
		this.i=i;
		this.j=i;
	}
	
	public pointers(int i,int j) {
		this.i=i;
		this.j=j;
	}

	@Override
	public String toString() {
		return "pointers [i=" + i + ", j=" + j + "]";
	}
	
	
}
