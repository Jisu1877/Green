package day0222.t3_ifTest;

import java.util.Scanner;

/*문제5) 가위/바위/보 게임...
두 사람이 숫자를 입력하여 누가 이겼는지? 출력하시오
(힌트 : 가위는 1로, 바위는 2로, 보는 3으로 입력하여 생각후 처리합니다.)
*/
public class Homework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int player1, player2;
		
		System.out.println("가위는 1, 바위는 2, 보는 3 입니다. 한판승부 시작!");
		System.out.print("player1? >> ");
		player1 = sc.nextInt();
		System.out.print("player2? >> ");
		player2 = sc.nextInt();
		
		if(player1 == 1) {
			if(player2 == 1) {
				System.out.print("무승부입니다.");
			} else if(player2 == 2) {
				System.out.print("player2 승!");
			} else if(player2 == 3) {
				System.out.print("player1 승!");
			} else {
				System.out.println("잘못된 숫자가 입력되었습니다.");
			}
		} else if(player1 == 2) {
			if(player2 == 2) {
				System.out.print("무승부입니다.");
			} else if(player2 == 1) {
				System.out.print("player2 승!");
			} else if(player2 == 3) {
				System.out.print("player1 승!");
			} else {
				System.out.println("잘못된 숫자가 입력되었습니다.");
			}
		} else if(player1 == 3) {
			if(player2 == 3) {
				System.out.print("무승부입니다.");
			} else if(player2 == 1) {
				System.out.print("player2 승!");
			} else if(player2 == 2) {
				System.out.print("player1 승!");
			} else {
				System.out.println("잘못된 숫자가 입력되었습니다.");
			}
		} else {										// 한 줄일때  { 생략가능하다. 그리고 else System.out.println() 이렇게 한줄로 이어붙이는 것도 가능하다. 한줄일때!
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}
		sc.close();
	}
}
