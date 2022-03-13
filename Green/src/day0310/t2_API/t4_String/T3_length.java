package day0310.t2_API.t4_String;

public class T3_length {
	public static void main(String[] args) {
		//length() : 문자열의 길이를 구한다.
		//toUpperCase() : 영문자를 대문자로 변환
		//toLowerCase() : 영문자를 소문자로 변환
		//			   012345678901234567890
		String msg1 = "Welcome to Korea!!!";	//전체 길이는 19자이다.
		String msg2 = "한국에 오신것을 환영합니다."; 	//15자
		System.out.println("msg1의 길이 : " + msg1.length());
		System.out.println("msg2의 길이 : " + msg2.length());
		System.out.println();
		
		//toUpperCase() / toLowerCase()
		System.out.println("msg1을 영문 대문자로 출력 : " + msg1.toUpperCase());
		System.out.println("msg1을 영문 소문자로 출력 : " + msg1.toLowerCase());
	}
}
