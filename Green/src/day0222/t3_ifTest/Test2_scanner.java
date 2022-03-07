package day0222.t3_ifTest;

import java.util.Scanner;
// 재import 단축키 : ctrl + shift + o(영어 오)
// 키보드를 통한 입력클래스 : Scanner() 외부클래스 사용
public class Test2_scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// sc는 클래스 변수명이라 한다.
		
		int su1, su2;
		
		System.out.print("첫번째 수를 입력하세요. ");
		su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요. ");
		su2 = sc.nextInt();
		
		if(su1 > su2) {
			System.out.println("su1가 su2보다 큽니다.");
			// 참일때 내용 수행
		}
		else {
			System.out.println("su2가 su1보다 큽니다.");
			// 거짓일때 내용 수행
		}
		sc.close();
	}
}
