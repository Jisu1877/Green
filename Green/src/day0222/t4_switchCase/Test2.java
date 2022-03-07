package day0222.t4_switchCase;

import java.util.Scanner;

// 부서코드가 1이면 '인사과', 2이면 '총무과', 3이면 '자재과', 4이면 '생산과' 나머지는 '홍보과'
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buser;
		int code;
		int bonbong;

		System.out.print("부서코드를 입력하세요?");
		code = sc.nextInt();

		switch (code) {
			case 1:
				buser = "인사과";
				bonbong = 2500000;
				break;
			case 2:
				buser = "총무과";
				bonbong = 3000000;
				break;
			case 3:
				buser = "자재과";
				bonbong = 2200000;
				break;
			case 4:
				buser = "영업과";
				bonbong = 2000000;
				break;
			default:
				buser = "홍보과";
				bonbong = 1800000;
		}

		System.out.println(buser + "는 본봉이 " + bonbong + " 입니다.");
		sc.close();
	}
}
