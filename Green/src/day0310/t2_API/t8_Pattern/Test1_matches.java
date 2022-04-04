package day0310.t2_API.t8_Pattern;

public class Test1_matches {
	public static void main(String[] args) {
		// 문자열 포함여부를 체크하는 메소드 : matches()
		// 포함여부? .*검색문자열*. (.**.  안에 검색할문자열을 넣는다.)
		// 대소문자 구별을 한다.
		
		String str1 = "Welcome to Korea";
		// str1안에 Korea란 문자가 있느냐?
		if(str1.matches(".*Korea*.")) {
			System.out.println("1.문장안에 Korea가 존재함");
		}
		else {
			System.out.println("1.문장안에 Korea가 없음");
		}
		
//		//문자의 범위로 비교시는 [-]을 사용한다.
//		String str2 = "WELCOME TO KOREA";
//		String str3 = "welcome to korea";
//		if(str3.matches(".*[A-Z]*.")) {
//			System.out.println("2.문장안에 영문 대문자가 존재함");
//		}
//		else {
//			System.out.println("2.문장안에 영문 대문자가 없음");
//		}
	}
}
