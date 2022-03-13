package day0310.t2_API.t3_Class;

import day0307.t9_exam.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();		//Car객체를 생성해야만 사용할 수 있다.
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {		//매개값으로 주어진 클래스를 찾지 못할수도 있기에 예외처리가 필요하다.
			Class clazz2 = Class.forName("day0307.t9_exam.Car"); //Car객체 생성없이 Class객체 가져오기.
			System.out.println(clazz2.getName()); 				//리턴받은 클래스객체의 .getName()
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			System.out.println();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
