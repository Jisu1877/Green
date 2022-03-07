package day0222.t1;

public class Test5 {
	public static void main(String[] args) {
		int a1;
		double b1;
		
		a1 = 100;
//		a1 = 10.123; 안됨
		b1 = 10.123;
		b1 = 20; // 실수는 정수를 포함하기에 에러가 안남
		System.out.println("a1 :" + a1);
		System.out.println("b1 :" + b1);	// 실수형이기에 값이 20.0으로 출력됨
		System.out.println();
		
//		a1 = b1; double을 int안에 넣을 수 없음
		b1 = a1;	// 자동변환 int가 double 로 들어가면 실수형이 된다. 100.0으로 출력됨. 받아들이는(double) 타입으로 바뀐다. 
		System.out.println("a1 :" + a1);
		System.out.println("b1 :" + b1);
		System.out.println();
		
//		a1 = b1; 강제타입변환 필요.
		a1 = (int) b1;	 // 강제타입변환.
		System.out.println("a1 :" + a1);
		System.out.println("b1 :" + b1);
		
	}
}
