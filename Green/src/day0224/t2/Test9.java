package day0224.t2;

import java.util.Scanner;

// 시작단과 끝단을 입력해서 출력하는 구구단 프로그램을 만드시오.
public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 시작단을 입력하세요? ");
		int startDan = sc.nextInt();
		System.out.print("출력할 끝단을 입력하세요? ");
		int endDan = sc.nextInt();
		
		System.out.println("* "+startDan+"단 ~ "+endDan+"단 *");
		for(int i=startDan; i<=endDan; i++) {
			System.out.println("* "+i+"단");
			for(int j=1; j<=10; j++) {
				System.out.println(i+" * "+j+" = " + (i*j));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
