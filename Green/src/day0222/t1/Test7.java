package day0222.t1;

public class Test7 {
	public static void main(String[] args) {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
//		byte result = byteValue + byteValue;	// 1바이트 + 1바이트라서 오류
//		byte result = 10 + byteValue;		// byteValue 만으로 이미 저장공간 가득참.
		int result2 = 5 + byteValue;
		float result3 = 5 + floatValue;
		double result4 = 5 + doubleValue;

		System.out.println("result2 :" + result2);
		System.out.println("result3 :" +result3);
		System.out.println("result4 :" +result4);
	}
}
