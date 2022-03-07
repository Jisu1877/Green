package day0222.homework;

import java.util.Scanner;

// 최대값을 구하시오.
public class Test1_max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su, max=0;
//		boolean sw = true;	//이렇게 만들어서 while() 변수에 넣어도 됨.
		int cnt = 0;
		
		while(true) {
			cnt++;
			System.out.print(cnt + ". 양의 정수를 입력하세요?(종료시는 999)");
			su = sc.nextInt();
			if(su == 999) break;
			
			if(su > max) {
				max = su;		
			}
		}
		System.out.println("입력한 수 "+(cnt-1)+"개 중에서 최대값은?" + max);	
		sc.close();
	}
}
