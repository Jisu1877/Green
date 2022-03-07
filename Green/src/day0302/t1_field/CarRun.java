package day0302.t1_field;

public class CarRun {
	public static void main(String[] args) {
		Car myCar = new Car();		//자기 객체 이름이 타입이 된다. 객체도 타입이다.(참조타입) 그래서 기본 초기값은 null이다.
		
		int su1 = myCar.su1;		//각 다른 su1이다.
		System.out.println("su1 : " + su1);
		
		int su2 = myCar.su2;
		System.out.println("su2 : " + su2);
		
		Car2 car2 = new Car2();		//실무에서는 변수명을 객체명을 소문자로 찍는다.
		System.out.println("name1 : " + car2.name1);
		System.out.println("name2 : " + car2.name2);
	}
}
