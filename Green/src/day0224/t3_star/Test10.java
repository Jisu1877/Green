package day0224.t3_star;

import java.util.Scanner;

/*
       *
      *** 
     ***** 
    ******* 
     *****
      ***
       * 
 */
	
public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia;
		
		System.out.print("다이아몬드의 중앙 별의 수를 입력하세요? ");
		dia = sc.nextInt();
		
		if(dia % 2 == 0) dia++;
		
		//상단별
		for(int i=1; i<=dia/2+1; i++) {
			// 공백처리
			for(int j=1; j<=dia/2-i+1; j++) {
				System.out.print(" ");
			}
			//별찍기
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//하단별
		for(int i=1; i<=dia/2; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=dia-2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
