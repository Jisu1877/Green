package day0302.t2_Constructor;

public class Test4 {
	String model;
	String color;
	int maxSpeed;
	
	public Test4(String model) {
		this.model = model;
		this.color = "은색";
		this.maxSpeed = 250;
	}
	
	public Test4(String model, String color) {
		this.model = model;
		this.color = color;
		this.maxSpeed = 250;
	}
	
	public Test4(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
