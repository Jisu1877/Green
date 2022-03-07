package day0222.homework;

import java.util.Scanner;

/*
문제4) 수를 입력받아 입력된 수중 최대값을 구하시오.
입력된 수가 999를 입력하면 프로그램을 종료시킨후 최대값을 출력시킨다.(출력결과 참조)
1.정수를 입력하세요?(종료는 999입력) 50
2.정수를 입력하세요?(종료는 999입력) 26
3.정수를 입력하세요?(종료는 999입력) 39
4.정수를 입력하세요?(종료는 999입력) 62
5.정수를 입력하세요?(종료는 999입력) 15
6.정수를 입력하세요?(종료는 999입력) 999
입력된 5개의 정수중 최대값은? 62
*/
public class Homework0223_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, max=0, cnt=1;
		
		System.out.print(cnt +".정수를 입력하세요?");
		num = sc.nextInt();
		
		max = num;
		
		while(true) {
			System.out.print(cnt + 1 +".정수를 입력하세요?");
			num = sc.nextInt();
			if(num == 999) {
				break;
			}
			else if(num > max) {
				max = num;
			}
			cnt++;
		}
		System.out.printf("입력된 "+cnt+"개의 정수중 최대값은? " + max);
		sc.close();
	}
}
