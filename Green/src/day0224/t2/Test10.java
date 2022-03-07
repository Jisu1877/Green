package day0224.t2;

import java.util.Scanner;

// 시작단과 끝단을 입력해서 출력하는 구구단 프로그램을 만드시오
// 단, 시작단은 끝단보다 큰 수가 올수 없도록 처리하시오.
public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int startDan, endDan;
		
		while(true) {
			System.out.print("출력할 시작단을 입력하세요? ");
			startDan = sc.nextInt();
			System.out.print("출력할 끝단을 입력하세요? ");
			endDan = sc.nextInt();
			
			if(startDan <= endDan) break;
			System.out.println("시작단은 끝단보다 작은수를 입력하셔야 합니다.");
		}
		
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
