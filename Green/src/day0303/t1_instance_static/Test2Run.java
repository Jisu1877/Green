package day0303.t1_instance_static;

public class Test2Run {
	public static void main(String[] args) {
		System.out.println("정적 멤버 출력!!!");
		
		System.out.println("pi : " + Test2.pi);
		
		int plus = Test2.plus(20, 30);
		System.out.println("두수의 합? " + plus);
		
		int minus = Test2.minus(20, 30);
		System.out.println("두수의 차? " + minus);
		System.out.println();
		
		System.out.println("***바람직하지 못한 사용예...***");
		
		Test2 test2 = new Test2();
		
		System.out.println("pi : " + test2.pi);
		
		plus = test2.plus(10, 20);
		System.out.println("두수의 합? " + plus);
		
		minus = test2.minus(10, 20);
		System.out.println("두수의 차? " + minus);
		
		//아래와 같이 인스턴스 멤버를 사용하려면 생성 후 사용해야 한다.
		System.out.println("hour : " + test2.hour);
		int multiply = test2.multiply(10, 20);
		System.out.println("두수의 곱? " + multiply);
	}
}
