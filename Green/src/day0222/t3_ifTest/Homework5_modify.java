package day0222.t3_ifTest;

/*문제5) 가위/바위/보 게임...
두 사람이 숫자를 입력하여 누가 이겼는지? 출력하시오
(힌트 : 가위는 1로, 바위는 2로, 보는 3으로 입력하여 생각후 처리합니다.)
 */
import java.util.Scanner;

public class Homework5_modify {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int player1, player2;

		while (true) {
			System.out.println("가위는 1, 바위는 2, 보는 3 입니다. 한판승부 시작!");
			System.out.print("player1? >> ");
			player1 = sc.nextInt();
			System.out.print("player2? >> ");
			player2 = sc.nextInt();

			if ((0 < player1 && player1 < 4) && (0 < player2 && player2 < 4))
				break;
//				if(0 < player2 && player2 <4) break;		//이렇게 해도 된다.

			else
				System.out.println("지정된 숫자만 입력해주세요. 다시 입력해주세요.");
		}

		if (player1 - player2 == -1 || player1 - player2 == 2) {
			System.out.println("player2가 승리하였습니다.");
		} else if (player1 - player2 == 0) {
			System.out.println("무승부입니다.");
		} else {
			System.out.println("player1이 승리하였습니다.");
		}
		sc.close();
	}
}
