package day0224.t2;

import java.util.Scanner;

public class Test10_js {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int startDan, endDan;
		
		while(true) {
			System.out.print("출력할 시작단을 입력하세요?");
			startDan = sc.nextInt();	
			
			System.out.print("출력할 끝단을 입력하세요?");
			endDan = sc.nextInt();	
			
			if(startDan <= endDan) break;
				System.out.println("시작단은 끝단보다 작은 수가 입력되어야합니다. 다시 입력해주세요.");
			}
		
		System.out.println("* "+startDan+"단 ~ "+endDan+"단 *");
		
		for(int i=startDan; i<=endDan; i++) {
			System.out.println("* "+i+"단");
			for(int j=1; j<=10; j++) {
				System.out.println(i+" * " +j+ " = " + (i*j));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
