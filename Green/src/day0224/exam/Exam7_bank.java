package day0224.exam;

import java.util.Scanner;

// 은행잔고 계산하기
public class Exam7_bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		int no, money;
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			no = sc.nextInt();
			
			switch(no) {
				case 1:
					System.out.print("예금액>");
					money = sc.nextInt();
					balance += money;
					break;
				case 2:
					System.out.print("출금액>");
					money = sc.nextInt();
					balance -= money;
					break;
				case 3:
					System.out.println("잔고> " + balance);
					break;
				default:
					run = false;
			}
		sc.close();
		}
		System.out.println("수고하셨습니다.");
	}
}
