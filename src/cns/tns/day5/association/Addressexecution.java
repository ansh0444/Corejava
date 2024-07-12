package cns.tns.day5.association;

public class Addressexecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address= new Address("Manpada","Dombivli","MH",421201);
		
		Student s1=new Student(14,"ansh",address);
		System.out.println(s1);
	}

}
