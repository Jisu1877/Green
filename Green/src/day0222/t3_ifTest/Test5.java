package day0222.t3_ifTest;

import java.util.Scanner;
// 재import 단축키 : ctrl + shift + o(영어 오)
// 키보드를 통한 입력클래스 : Scanner() 외부클래스 사용

// 점수를 입력받아서 합격/불합격을 판정하시오.
// 점수가 60점 이상은 '합격', 60점 미만은 불합격
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// sc는 클래스 변수명이라 한다.
		
		int jumsu;	//alt + shift + R : 변수명 한꺼번에 변경
		
		System.out.print("숫자를 입력하세요. ");
		jumsu = sc.nextInt();
		
		if(jumsu >= 60 ) {			
			System.out.printf("입력된 점수 %d는 합격입니다.", jumsu);
			// 참일때 내용 수행
		}
		else {
			System.out.println("입력된 수 "+jumsu+"는 불합격입니다.");
			// 거짓일때 내용 수행
		}
		sc.close();
	}
}
