package day0302.t3_method;

import java.util.Scanner;

public class SumRun3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sum sum = new Sum();				//  Sum 생성자 생성.
		int[] su = null;

		System.out.print("몇 개의 숫자를 덧셈하시겠습니까? ");
		int cnt = sc.nextInt();
		su = new int[cnt];
		for(int i=0; i<cnt; i++) {
			System.out.print((i+1) + "번째 값을 입력하세요? ");
			su[i] = sc.nextInt();
		}
		
		int res;							// 리턴받은 값을 저장할 변수 선언.
		res = sum.add(su);					// su라는 배열을 넘김.
		System.out.println("res = " + res);
		
		sc.close();
	}
}
