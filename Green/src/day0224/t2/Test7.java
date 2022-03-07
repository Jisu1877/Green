package day0224.t2;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 단을 입력하세요.");
		int dan = sc.nextInt();
		
		System.out.println("* "+dan+"단 *");
		for(int i=1; i<=10; i++) {
			System.out.println(dan + " * " +i+ " = " + (dan*i));
		}
		
		sc.close();
	}
}
