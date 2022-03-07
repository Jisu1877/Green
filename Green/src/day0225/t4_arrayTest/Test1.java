package day0225.t4_arrayTest;

import java.util.Scanner;

// 성명, 국어, 영어, 수학 점수를 입력받아 총점, 평균, 학점을 구하는 프로그램을 만드시오.
// 단, 모든 입력자료는 배열에 저장시켜 놓은 후 처리하시오.(한 반 학생은 최대 100명이내이다.)
public class Test1 {
	public static void main(String[] args) {
		//준비
		Scanner sc = new Scanner(System.in);
		String[] name = new String[100]; 				//배열 프로그램 짤때 가장 먼저 생각해야하는 건 묶을 수 있는 정보들이다. 성명 / 국어,영어,수학점수,총점 / 평균 / 학점 이런식으로 나눠야한다.
		int[][] score = new int[4][100];				//2차원 배열을 쓰는 이유는 각 반 100 명당 국어,영어,수학,총점이라는 4가지 항목을 갖기때문에.
		double[] avg = new double[100];
		char[] grade = new char[100];
		int cnt = 0;
		String[] title = {"성명","국어","영어","수학","총점","평균","학점"};
		
		//입력 및 처리
		while(true) {
			System.out.print("성명을 입력하세요?(종료시는 999) ");
			name[cnt] = sc.next();								// 성명을 배열에 담는다.
			if(name[cnt].equals("999")) break;
			
			for(int i=0; i<3; i++) {
				System.out.println(title[i+1] + "점수를 입력하세요?");
				score[i][cnt] = sc.nextInt(); 					//0번(cnt)째 사람부터 국어점수(0)부터 입력받음.
				score[3][cnt] += score[i][cnt];					//총점구하기. 총점자리인 3번에 cnt번 사람의 점수 누적. 
			}
			avg[cnt] = score[3][cnt] /3.0;
			if(avg[cnt] >= 90) grade[cnt] = 'A';
			else if(avg[cnt] >= 80) grade[cnt] = 'B';
			else if(avg[cnt] >= 70) grade[cnt] = 'C';
			else if(avg[cnt] >= 60) grade[cnt] = 'D';
			else grade[cnt]= 'F';
			cnt++;
		}
		//출력
		System.out.println("\t\t*** 성 적 표 ***");
		System.out.println("==============================================================");
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		for(int i=0; i<cnt; i++) {
			System.out.print(name[i] + "\t");
			for(int j=0; j<score.length; j++) {
				System.out.print(score[j][i]+ "\t");				
			}
			System.out.printf("%.2f\t%s\n",avg[i],grade[i]);
		}
		System.out.println("==============================================================");
		sc.close();
	}
}
