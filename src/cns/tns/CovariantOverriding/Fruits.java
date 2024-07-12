package cns.tns.CovariantOverriding;

public class Fruits {

	private int rate;

	public Fruits(int rate) {
		super();
		this.rate = rate;
	}
	
	//method
	public void buy() {
		System.out.println("Frutis are buying at rate: "+rate);
	}
	public void sell() {
		System.out.println("Fruits are Selling at rate: ");
	}
}
