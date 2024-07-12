package cns.tns.CovariantOverriding;

public class Apple extends Fruits {
	
	private String name;
	private String color;
	
	public Apple(int rate, String name, String color) {
		super(rate);
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//getter setters.
	
	
	
}
