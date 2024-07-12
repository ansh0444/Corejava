package cns.tns.statickey;

public class Employee {
	private int id;
	private String name;
	
	//static variable are shared by all instances of the class.
	private static String companyname="TNS";

	//constructor
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",companyname=" + companyname + "]";
	}
	
	
	
}
