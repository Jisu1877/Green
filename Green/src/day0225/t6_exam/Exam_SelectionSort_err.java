package day0225.t6_exam;

import java.util.Scanner;

public class Exam_SelectionSort_err {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		int temp;
		
		for(int i=0; i<num.length; i++) {
			System.out.println("정렬하고자 하는 수를 입력하세요. (종료는 999입력)");
			num[i] = sc.nextInt();
			if(num[i] == 999) {
				break;
			}
		}
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; i<num.length; i++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
		System.out.println(num[i]+ " / ");
		}
		sc.close();
	}
}
