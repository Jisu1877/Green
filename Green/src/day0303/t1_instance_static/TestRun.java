package day0303.t1_instance_static;

public class TestRun {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		
		System.out.println("pi : " + test1.pi);
		
		int plus = test1.plus(10, 20);
		System.out.println("두수의 합? " + plus);
		
		int minus = test1.minus(10, 20);
		System.out.println("두수의 차? " + minus);
	}
}
