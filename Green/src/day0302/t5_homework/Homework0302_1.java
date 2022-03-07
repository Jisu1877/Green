package day0302.t5_homework;

import java.util.Scanner;

// 정수를 입력받아(999입력시 종료),
// 오름차순(1번), 내림차순(2번)으로 출력할까요?

// 1. 입력된 값 출력하기
// 2. 최대값, 최소값, 평균값 출력
// 3. 입력된 수를 오름차순/내림차순 출력

// 앞의 처리를 처리클래스를 만들어서 처리하도록하고, 실행클래스에서 처리클래스를 생성하여 결과를 확인할 수 있도록 한다.
public class Homework0302_1 {
	public static void main(String[] args) {
		Process proc = null;
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int cnt = 0;
		int choice;
		
		for(int i=0; i<num.length; i++) {
			System.out.print((cnt + 1) +".정수를 입력하세요.(종료는 999 입력)>> ");
			num[i] = sc.nextInt();
			if(num[i] == 999) {
				System.out.println("입력하신 값은...");
				break;
			}
			cnt++;
		}
		proc = new Process(num, cnt);
		proc.print();
		proc.setMaxMin();
		int max = proc.max;
		int min = proc.min;
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("평균값 : " + proc.setAvg());
		
		System.out.print("오름차순 정렬을 선택하려면 1을, 내림차순 정렬을 선택하려면 2를 선택하세요. >> ");
		choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.print("오름차순 정렬 >> ");
				proc.sort1();
				
				break;
			case 2:
				System.out.print("내림차순 정렬 >> ");
				proc.sort2();
				break;
		}
		proc.print();
		sc.close();
	}
}
