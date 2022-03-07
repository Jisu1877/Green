package day0222.t3_ifTest;

import java.util.Scanner;

// 문제4) 두수를 입력받아 큰수에서 적은수로 값을 나누어서 출력되는 결과를 소수이하 2자리까지 출력시키시오.
public class Homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.print("첫번째 수를 입력하세요. ");
		num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요. ");
		num2 = sc.nextInt();
		
		// 출력 Format ==> printf()사용
		// 정수 : %d, 실수 : %f, 문자열 : %s
		// %'전체길이'양식코드 예) %5d : 전체 자리수가 5자리를 확보후 우측부터 숫자출력
		// 					%5.2f : 전체 자리수가 5자리를 확보후 소수이하 2자리 출력, 우측부터 숫자출력
		
		double result1;
		if(num1 > num2) {
			result1 = (num1 / num2);
			System.out.printf("나눈 결과는 %1.2f입니다." ,result1);
		}
		else if(num1 < num2) {
			result1 = (num2 / num1);
			System.out.printf("나눈 결과는 %1.2f입니다." ,result1);
		}
		
		sc.close();
	}
}
