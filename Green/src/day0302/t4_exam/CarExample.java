package day0302.t4_exam;

public class CarExample {
	public static void main(String[] args) {
		Car mycar  = new Car();
		mycar.keyTurnOn();
		mycar.run();
		int speed = mycar.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");
	}
}
