package day0317;

public class IncreaseDecreaseOperatorExample1 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		// 우선 2가 된 x와 10의 합
		int result1 = ++x + 10; 
		// 아직 1인 y와 10의 합 -> result2에 11을 대입연산 후 y는 2가 됨.
		int result2 = y++ + 10; 
		int result3 = y;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
	}
}
