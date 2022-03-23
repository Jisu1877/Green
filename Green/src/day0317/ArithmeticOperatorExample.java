package day0317;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		byte byte1 = 1;
		byte byte2 = 1;
//		byte byte3 = byte1 + byte2; //컴파일 에러
		int result1 = byte1 + byte2; //int 타입 변수에 산출값 대입.
		System.out.println("result1 = " + result1);
		
		int int1 = 10;
		int int2 = 4;
		int result2 = int1 / int2;
		double result3 = int1 / int2;
		System.out.println("과연 result2의 값은 2.5일까? 2일까? / result2 : " + result2);
		System.out.println("과연 result3의 값은 2.5일까? 2일까? / result3 : " + result3);
		System.out.println("만약 2.5를 산출결과로 얻고 싶다면?");
		System.out.println("피연산자 중 1개가 실수타입이어야 한다.");
		double result4 = (int1* 1.0) / int2;
		double result5 = (double) int1 / int2;
		double result6 = int1 / (double) int2;
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("result6 : " + result6);
	}
}
