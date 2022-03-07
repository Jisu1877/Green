package day0222.t3_ifTest;

import java.util.Scanner;

// 문제1) 두개의 정수를 입력받아 큰수와 적은수를 출력하시오.
public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2;
		
		System.out.print("첫번째 수를 입력하세요. ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요. ");
		su2 = sc.nextInt();
		
		if(su1 > su2) {
			System.out.println("첫번째 수가 두번째 수보다 큽니다.");
		}
		else if(su1 < su2){
			System.out.println("두번째 수가 첫번째 수보다 큽니다.");
		}else {
			System.out.println("첫번째 수와 두번째 수는 같습니다.");
		}
		sc.close();
	}
}
