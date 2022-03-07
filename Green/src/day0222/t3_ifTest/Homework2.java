package day0222.t3_ifTest;

import java.util.Scanner;

// 문제2) 1개의 정수를 입력받아서, 입력받은수가 '양의 정수'인지, '음의 정수'인지 '0'인지를 출력하시오.
public class Homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력은 했는데 import를 받지 않았을 때, ctrl + shift + O(알파벳 오) >> re import

		int num;

		System.out.print("정수를 입력하세요. ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("양의 정수입니다.");
		} else if (num < 0) {
			System.out.println("음의 정수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		sc.close();
	}
}
