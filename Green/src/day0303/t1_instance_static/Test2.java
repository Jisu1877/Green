package day0303.t1_instance_static;

//정적(static) 멤버
public class Test2 {
	//정적 필드
	static double pi = 3.141592;
	
	//정적 메소드
	static int plus(int su1, int su2) {
		return su1 + su2;
	}
	//정적 메소드
	static int minus(int su1, int su2) {
		return su1 - su2;
	}
	
	//인스턴스 필드
	int hour = 24;
	
	//인스턴스 메소드
	int multiply(int su1, int su2) {
		return su1 * su2;
	}
}
