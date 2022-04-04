package day0310.t2_API.t8_Pattern;

import java.util.regex.Pattern;

// 정규식을 처리하기위한 클래스와 메소드 : Pattern.matches()
public class Test2_pattern {
	public static void main(String[] args) {
		String str1 = "Welcome to Korea";
		String str2 = "Welcome to 코리아";
		String str3 = "WelcometoKorea";
		String str4 = "$Welcome to_ Korea";
		String str5 = "welcometokorea";
		String str6 = "WELCOMETOKOREA";
		
		// 범위 지정 및 포함여부는 : ^[-]*$
		// 문장안에 영문 소문자를 포함하고 있는가?
//		if(Pattern.matches("^[A-Z]*$", str6)) {
		if(Pattern.matches("^[a-z]*$", str5)) {		
			System.out.println("1.문장안에 영문 소문자만 존재합니다.");
		}
		else {
			System.out.println("1.문장안에 영문 소문자외 다른 문자가 있습니다.");
		}
		
		// 문장안에 영문 대/소문자를 포함하고 있는가?
		if(Pattern.matches("^[a-zA-Z]*$", str4)) {		
				System.out.println("2.문장안에 영문 대/소문자만 존재합니다.");
		}
		else {
			System.out.println("2.문장안에 영문 대/소문자외 다른 문자가 있습니다.");
		}
		
		// 문장안에 영문 대/소문자, 그리고 $와 _를 포함하고 있는가?
		if(Pattern.matches("^[a-zA-Z$_ ]*$", str6)) {		
			System.out.println("3.문장안에 영문 대/소문자와 $,_,공백(' ')만 존재합니다.");
		}
		else {
			System.out.println("3.문장안에 영문 대/소문자,  $,_,공백(' ')외 다른 문자가 있습니다.");
		}
		
		// 숫자의 포함 유무?
		String str7 = "0123456789";
		if(Pattern.matches("^[0-9]*$", str1)) {
			System.out.println("4.문장안에 숫자만 있습니다.");
		}
		else {
			System.out.println("4.문장안에 숫자외의 다른 문자들이 있습니다.");
		}
		
		// 숫자의 포함 유무의 반전?
		if(!Pattern.matches("^[0-9]*$", str7)) {
			System.out.println("5.문장안에 숫자외의 다른 문자들이 있습니다.");
		}
		else {
			System.out.println("5.문장안에 숫자만 있습니다.");
		}
		
		// 한글의 포함 유무?
		String str8 = "홍길동";
		if(Pattern.matches("^[가-힣]*$", str8)) {
			System.out.println("6.문장안에 한글만 있습니다.");
		}
		else {
			System.out.println("6.문장안에 한글외의 다른 문자들이 있습니다.");
		}
		
		// 전화번호 입력시 숫자와 '-'만 입력되었는지?
		String str9 = "010-3423-2704";
		if(Pattern.matches("^[0-9-]*$", str9)) {
			System.out.println("7.전화번호 형식이 맞습니다.");
		}
		else {
			System.out.println("7.전화번호 형식이 틀립니다.");
		}
		
		// 문장안에 영문 대/소문자, 그리고 '한글'과 '숫자'를 포함하고 있는가?
		String str10 = "Atom1234";
		if(Pattern.matches("^[a-zA-Z가-힣0-9]*$", str10)) {		
			System.out.println("8.문장안에 영문 대/소문자와 '한글', '숫자'만 존재합니다.");
		}
		else {
			System.out.println("8.문장안에 영문 대/소문자와 '한글', '숫자'외 다른 문자가 있습니다.");
		}
		
		
		//전화번호 형식에 맞게 처리 되었는지? 자리수 지정시는 {} 사용 
		String regex = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}";	// {2,3}은 2자리,3자리까지 허용이라는 뜻. 예를들어 02- 인 경우도 있으니..
		String str11 = "010-3423-2704";
		if(Pattern.matches(regex, str11)) {		
			System.out.println("9.전화번호 형식이 맞습니다.");
		}
		else {
			System.out.println("9.전화번호 형식이 틀립니다.");
		}
		
		// 특수문자 체크 명령어? \\p{Punct}
		// 특수문자가 입력되어 있을 경우 모두 뽑아서 버리시오.(replaceAll())
		String str12 = "문자자료 - Alpha : 구두점 ~!@#$%^&*()_-=+  제외??<>,./{}[]끝";
		System.out.println("str12 : " + str12);
		System.out.println("str12(특수문자제거) : " + str12.replaceAll("\\p{Punct}", ""));
	}
}
