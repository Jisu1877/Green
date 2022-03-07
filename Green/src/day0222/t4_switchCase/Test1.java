package day0222.t4_switchCase;
//부서코드를 입력받아서 본봉을 출력하세요.
//부서코드는? 인사과(i), 총무과(c), 자재과(j), 영업과(y), 기타문자는 '홍보과'로 한다.
//본봉테이블? 인사과(2500000), 총무과(3000000), 자재과(2200000), 영업과(2000000), 홍보과(1800000) 
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buser;
		char code;
		int bonbong;
		
		System.out.print("부서코드를 입력하세요?");
		code = sc.next().charAt(0);
		
		switch(code) {
			case 'i':
			case 'I':
				buser = "인사과";
				bonbong = 2500000;
				break;
			case 'c':
			case 'C':
				buser = "총무과";
				bonbong = 3000000;
				break;
			case 'j':
			case 'J':
				buser = "자재과";
				bonbong = 2200000;
				break;
			case 'y':
			case 'Y':
				buser = "영업과";
				bonbong = 2000000;
				break;
			default:
				buser = "홍보과";
				bonbong = 1800000;
		}
		System.out.println(buser + "는 본봉이 "+bonbong+" 입니다.");
		
		sc.close();
	}
}
