package day0225.t6_exam;

import java.util.Scanner;

public class SelectionSort3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//자료 입력
		int[] m = new int[100];
		int temp;
		int cnt = 0;
		
		while(true) {
			System.out.print("정수를 입력하세요?(종료시 999입력)");
			m[cnt] = sc.nextInt();
			if(m[cnt] == 999) break;
			cnt++;																			//이 알고리즘에선 cnt카운팅이 중요! for문 조건을 넣어주려면! cnt가 입력된 데이터의 갯수를 카운팅해주는 것이다.
		}
		
		//출력
		System.out.println("원본 값("+cnt+"개)");				//0~5번까지 데이터 값이 들어갔고, 6번방엔 999가 들어간다. 999받아서 while 탙출할때 cnt=6인채로 탈출한다. 
																									//cnt++를 지나가지 않으므로. 그리고 데이터 갯수는 6개라서 그대로 cnt + 개로 찍는다.
		for(int i=0; i<cnt; i++) {
			System.out.print(m[i] + "/");
		}
		System.out.println();
		
		//처리
		for(int i=0; i<cnt-1; i++) {				
			for(int j=i+1; j<cnt; j++) {		
				if(m[i] > m[j]) {									
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		//출력
		System.out.println("정렬된 값("+cnt+"개)");
		for(int i=0; i<cnt; i++) {
			System.out.print(m[i] + "/");
		}
		sc.close();
	}
}
