package day0302.t2_Constructor;

public class Test5 {
	String model;
	String color;
	int maxSpeed;
	
	public Test5(String model) {
		this(model, null, 0);
	}
	
	public Test5(String model, String color) {
		this(model, color, 0);
	}
	
	public Test5(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
