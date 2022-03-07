package day0307.t9_exam;

import java.util.Scanner;

// 정수 5개를 입력받아서 원본데이터 출력, 오름차순 정렬, 내림차순정렬
public class Exam2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt=0;
		
		int[] num = new int[5];
		
		while(true) {
			System.out.print("정수를 5개를 입력하세요?");
			num[cnt] = scanner.nextInt();
			if(cnt==4) break;
			cnt++;																		
		}
		
		//원본데이터 출력
		System.out.println("원본 값");
		for(int i=0; i<cnt+1; i++) {
			System.out.print(num[i] + "/");
		}
		System.out.println();
		
		//오름차순 정렬
		for(int i=0; i<cnt+1; i++) {				
			for(int j=i+1; j<cnt+1; j++) {		
				if(num[i] > num[j]) {									
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		//오름차순정렬출력
		System.out.println("오름차순 정렬");
		for(int i=0; i<cnt+1; i++) {
			System.out.print(num[i] + "/");
		}
		System.out.println();
		
		//내림차순 정렬
		for(int i=0; i<cnt+1; i++) {				
			for(int j=i+1; j<cnt+1; j++) {		
				if(num[i] < num[j]) {									
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		//내림차순정렬출력
		System.out.println("내림차순 정렬");
		for(int i=0; i<cnt+1; i++) {
			System.out.print(num[i] + "/");
		}
		System.out.println();
		
		for (int i = num.length; i < 0; i--) {
			System.out.print(num[i] + "/");
		}
		System.out.println();
		
		scanner.close();
	}
}
