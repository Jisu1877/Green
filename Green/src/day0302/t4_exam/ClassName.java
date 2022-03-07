package day0302.t4_exam;
// int타입의 double타입으로 자동변환.
public class ClassName {
	int result1;
	double result2;
	
	int method1(int x, int y) {
		int result = x + y;
		return result;
	}
	
	void method2() {
		result1 = method1(10,20);		// result1에는 30이 저장
		result2 = method1(10,20);	// result2에는 30.0이 저장.
		
	}
}
