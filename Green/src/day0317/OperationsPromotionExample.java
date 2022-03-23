package day0317;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; //컴파일에러
		int intValue1 = byteValue1 + byteValue2; //int 타입 변수에 결과저장.
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; //컴파일에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2); //강제타입변환필요
		
		int intValue3 = 10;
//		int intValue4 = 10 / 4.0; //컴파일에러
		double doubleValue = intValue3 / 4.0;
		System.out.println(doubleValue);
	}
}
