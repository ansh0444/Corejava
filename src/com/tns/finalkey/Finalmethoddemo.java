package com.tns.finalkey;

public class Finalmethoddemo extends Finalmethod {

	@Override
	void show() {
		System.out.println("Hello all");
	}
	public static void main(String[] args) {
		//can we override the final method.lets see
		
		// TODO Auto-generated method stub
		Finalmethoddemo fm=new Finalmethoddemo();
		fm.show();
	}

}
