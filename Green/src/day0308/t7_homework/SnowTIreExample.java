package day0308.t7_homework;

public class SnowTIreExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire(); //자식객체 생성
		Tire tire = snowTire; //부모타입으로 자동타입변환
		
		snowTire.run(); //자식객체의 run()메소드를 호출 (SnowTire클래스의 메소드를 바로 호출한것.)
		tire.run(); //run()메소드는 부모와 자식 둘다 가지고 있다, 하지만 오버라이딩된 자식객체의 메소드가 먼저 호출된다.
	}
}
