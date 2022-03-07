package day0225.homework;

import java.util.Scanner;

public class Homework0228_4 {
	public static void main(String[] args) {
		boolean run = true;
		int[] scores = null;
		int studentNum = 0;
		int cnt = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
				case 1:
					System.out.print("학생수> ");
					studentNum = scanner.nextInt();
					break;
				case 2:
					scores = new int[studentNum];
					for (int i = 0; i < studentNum; i++) {
						System.out.print("scores["+i+"]>");
						scores[i] = scanner.nextInt();
						cnt++;
					}
					break;
				case 3:
					for(int i = 0; i < scores.length; i++) {
						System.out.println("scores["+i+"]>" + scores[i]);
					}
					break;
				case 4:
					int temp, tot = 0;
					int sw = 1;
					double avg;
					for(int i=0; i<scores.length-1; i++) {
						for(int j=i+1; j<scores.length; j++) {
							if(scores[i]>scores[j]) {
								temp = scores[i];
								scores[i] = scores[j];
								scores[j] = temp;
								sw = 0;
							}
							tot += scores[i];
							if(sw == 1) {
								break;
							}
						}
					}
					System.out.println("최고점수 : " + scores[scores.length-1]);
					avg = (double)tot / (double)cnt;
					System.out.printf("평균점수 : %.2f\n", avg);
					break;
				case 5:
					System.out.println("프로그램 종료.");
					run = false;
					break;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
		scanner.close();
	}
}
