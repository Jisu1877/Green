package day0302.t3_method;
// 메소드 오버로딩 : 클래스 내에 같은 이름의 메소드를 여러개 선언하는 것.
// 하나의 메소드 이름으로 다양한 매개값 받기 위해 메소드 오버로딩.
// 오버로딩의 조건 : 매개변수의 타입, 개수, 순서가 달라야 한다. 변수명이 달라지는 것은 아니다.
// 리턴타입은 무관하다.

public class Process {
	void calc(int su1, int su2) {
		System.out.println("su1 + su2 = " + (su1 + su2));
	}
	
	void calc(double su1, double su2) {
		System.out.println("su1 + su2 = " + (su1 + su2));
	}
	
	void calc(String su1, String su2) {
		System.out.println("su1 + su2 = " + (su1 + su2));
	}
	
	void calc(String name) {
		System.out.println("name = " + name);
	}
	
	void calc(String name, int age) {
		System.out.println("name = "+name +" , age = " + age);
	}
	void calc(int age, String name) {
		System.out.println("name = "+name +" , age = " + age);
	}
}
