package day0222.t3_ifTest;
// 문제3) 수를 입력받아, 입력된 수가 '2의 배수'인지, '3의 배수'인지, '5의 배수'인지, 아니면 '일반수'인지를 출력하시오.

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("수를 입력하세요. ");
		num = sc.nextInt();
		
		if((num % 2) == 0) {
			System.out.print("2 ");
		}
		
		if((num % 3) == 0) {
			System.out.print("3 ");
		}
		
		if((num % 5) == 0) {
			System.out.print("5 ");
		}
		if (num % 2 != 0 && num % 3 != 0 && num % 5 !=0) {
			System.out.println("일반수입니다.");
		} else {
			System.out.println("의 배수입니다.");
		}
		sc.close();
	}
}
