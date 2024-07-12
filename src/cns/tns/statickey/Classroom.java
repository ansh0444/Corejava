package cns.tns.statickey;

public class Classroom {
	private int section;
	private static int srno;
	
	//allows only static member
	static {
		//System.out.println("Is static block");
		srno=10;
	}

	//constructor
	public Classroom() {
		System.out.println("Inside constructor");
		section++;
		srno++;
	}

	@Override
	public String toString() {
		return "Classroom [section=" + section + ",srno=" + srno + "]";
	}
	
//	static void display() {
//		System.out.println("srno:"+srno);
//		//System.out.println("section:"+section);
//	}
//	
//	public void show() {
//		System.out.println("srno:"+srno);
//		System.out.println("section:"+section);
//	}
	
	
	
	
	
}
