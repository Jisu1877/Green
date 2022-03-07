package day0222.t3_ifTest;

import java.util.Scanner;
// 재import 단축키 : ctrl + shift + o(영어 오)
// 키보드를 통한 입력클래스 : Scanner() 외부클래스 사용

// 수를 입력받아 짝수인지 홀수인지 판별하시오.
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// sc는 클래스 변수명이라 한다.
		
		int num;
		
		System.out.print("숫자를 입력하세요. ");
		num = sc.nextInt();
		
		if((num % 2) != 0) {				// != 같지 않다.
			System.out.printf("입력된 수 %d는 홀수입니다.", num);
			// 참일때 내용 수행
		}
		else {
			System.out.println("입력된 수 "+num+"는 짝수입니다.");
			// 거짓일때 내용 수행
		}
		sc.close();
	}
}
