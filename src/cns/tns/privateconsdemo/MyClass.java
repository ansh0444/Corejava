//to demonstrate private constructor
package cns.tns.privateconsdemo;

//1 - create obj in same class
//2- static use kiya hai toh wo obj ko hi point karega MyCLass .
//3- public method banai hai taki dusre class me use kar sake.
public class MyClass {
	private int id;
	private static MyClass obj = new MyClass();
	
	//private constructor
	private MyClass() {
		System.out.println("Private constructor");
	}

	//getter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//factory method to use the obj in another class by using getobject.
	//so we are returning the object from MyClass i.e this
	public static MyClass getObject() {
		return obj;
	}
	//to string method.
	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	
	

	
}
