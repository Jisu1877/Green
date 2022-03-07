package day0222.t3_ifTest;

import java.util.Scanner;
// 재import 단축키 : ctrl + shift + o(영어 오)
// 키보드를 통한 입력클래스 : Scanner() 외부클래스 사용
// 나이를 입력받아서 '20세 이상만 회원가입'이란 메세지를 출력하시오.
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// sc는 클래스 변수명이라 한다.
		
		int age;
		
		System.out.print("나이를 입력하세요. ");
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("회원에 가입되었습니다.");
			// 참일때 내용 수행
		}
		else {
			System.out.println("20세 이상만 회원에 가입하실 수 있습니다.");
			// 거짓일때 내용 수행
		}
		sc.close();
	}
}
