package day0222.t3_ifTest;

import java.util.Scanner;

// 부서코드를 입력받아서 본봉을 출력하세요.
// 부서코드는? 인사과(i), 총무과(c), 자재과(j), 영업과(y), 기타문자는 '홍보과'로 한다.
// 본봉테이블? 인사과(2500000), 총무과(3000000), 자재과(2200000), 영업과(2000000), 홍보과(1800000), 
public class Test11_equals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code, buser;
		int bonbong;
		
		System.out.print("부서코드를 입력하세요?");
		code = sc.next();
		
//		if(code == "i") {		// String은 참조타입이라서 문자열 비교는 .equals를 사용해야한다.
		if(code.equals("i")) {
			buser = "인사과";
			bonbong = 2500000;	
		}
		else if(code.equals("c")) {
			buser = "총무과";
			bonbong = 3000000;
		}
		else if(code.equals("j")) {
			buser = "자재과";
			bonbong = 2200000;
		}
		else if(code.equals("y")) {
			buser = "영업과";
			bonbong = 2000000;
		}
		else {
			buser = "홍보과";
			bonbong = 1800000;
		}
		
		System.out.println(buser + "는 본봉이 "+bonbong+" 입니다.");
		
		sc.close();
	}
}
