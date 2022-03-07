package day0225.homework;

import java.util.Scanner;

//컴퓨터와의 가위바위보 게임. (승률까지 계산해서 출력)
public class Homework0228_3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		int random;
		int gameCnt = 0;
		int userWin = 0;
		double win;
		
		System.out.println("가위바위보 게임을 시작합니다.(종료는 999입력)");
		
		while(true) {
			System.out.print("가위는 1, 바위는 2, 보는 3 입니다. \nuser1입력>> ");
			choice = scanner.nextInt();
			if(choice == 999) {
				System.out.println("종료합니다.");
				break;
			}else if(!(0 < choice && choice <4)) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				System.out.println();
				continue;
			}
			random = (int)(Math.random()*3)+1;
			System.out.println("computer1 >> " + random);
			if(choice - random == -1 || choice - random == 2) {
				System.out.println("당신이 졌습니다! computer1 승!");
				System.out.println();
			}else if(choice - random == 0) {
				System.out.println("무승부입니다.");
				System.out.println();
			}else {
				System.out.println("computer1가 졌습니다. user1 승리!");
				System.out.println();
				userWin++;
			}
			gameCnt++;
		}
		if(gameCnt > 0) {
			win = ((double)userWin / (double)gameCnt) * 100.0;
			System.out.printf("user1 당신은 %d번의 게임 중 %d번 이겼습니다. 최종승률은 : %.2f%%입니다.", gameCnt, userWin, win);
		}
		scanner.close();
	}
}
