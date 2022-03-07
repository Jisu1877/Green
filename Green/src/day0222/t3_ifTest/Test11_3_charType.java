package day0222.t3_ifTest;

import java.util.Scanner;

// 부서코드를 입력받아서 본봉을 출력하세요.
// 부서코드는? 인사과(i), 총무과(c), 자재과(j), 영업과(y), 기타문자는 '홍보과'로 한다.
// 본봉테이블? 인사과(2500000), 총무과(3000000), 자재과(2200000), 영업과(2000000), 홍보과(1800000), 
// char 타입으로 문자열 받아서 비교하기 : charAt(0) 메소드 사용 0을 입력하는 이유는 첫번째 자리 지칭하는 숫자가 0이기 때문이다. (두번째 자리는 1)
public class Test11_3_charType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buser;
		char code;
		int bonbong;
		
		System.out.print("부서코드를 입력하세요?");
		code = sc.next().charAt(0);				// code가 char 타입으로 선언되었기 때문에 sc.next()으로는 에러뜬다. 
		
		if(code == 'i' || code == 'I') {		// char 타입이기 때문에 equals는 사용할 수 없고 ==을 사용한다.
			buser = "인사과";
			bonbong = 2500000;	
		}
		else if(code == 'c' || code == 'C') {
			buser = "총무과";
			bonbong = 3000000;
		}
		else if(code == 'j' || code == 'J') {
			buser = "자재과";
			bonbong = 2200000;
		}
		else if(code == 'y' || code == 'Y') {
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
