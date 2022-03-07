package day0225.homework;
//한영사전과 영한사전 중 선택을 받아 단어의 뜻을 알려주는 사전 프로그램을 만드시오.(없는 단어를 입력하면 다시 반복받는다.)
import java.util.Scanner;

public class Homework0228_1_dictionary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		String word;
		int cnt = 1;

		String[][] eng = { { "love", "사랑" }, { "friendship", "우정" }, { "trust", "신뢰" }, { "honesty", "정직" } };
		String[][] kor = { { "사랑", "love" }, { "우정", "friendship" }, { "신뢰", "trust" }, { "정직", "honesty" } };

		while (true) {
			System.out.print(cnt + ". 영한사전은 E을 한영사전은 K를 입력해주세요.(종료는 9 입력.) \n사전선택 : ");
			choice = sc.next();
			if (choice.equals("9")) {
				System.out.println("종료됩니다. 감사합니다.");
				break;
			}
			if (choice.equals("e") || choice.equals("E") || choice.equals("k") || choice.equals("K")) {
				switch (choice) {
					case "E":
					case "e":
						System.out.print("뜻이 궁금한 영단어는?(영어입력) : ");
						word = sc.next();
						boolean found = false;
						for (int i = 0; i < eng.length; i++) {
							if (eng[i][0].equals(word)) {
								System.out.println("입력하신 단어 '" + word + "'은 영어로 '" + eng[i][1] + "'입니다.");
								System.out.println();
								found = true;
								break;
							}
						}
						if (found == false) {
							System.out.println("입력하신 단어 '" + word + "'는 사전에 없습니다. 다시입력해주세요.");
							System.out.println();
						}
						break;
					case "K":
					case "k":
						System.out.print("뜻이 궁금한 단어는?(한국어입력) : ");
						word = sc.next();
						boolean found1 = false;
						for (int i = 0; i < kor.length; i++) {
							if (kor[i][0].equals(word)) {
								System.out.println("입력하신 단어 '" + word + "'의 뜻은 '" + kor[i][1] + "'입니다.");
								System.out.println();
								found1 = true;
								break;
							}
						}
						if (found1 == false) {
							System.out.println("입력하신 단어 '" + word + "'는 사전에 없습니다. 다시입력해주세요.");
							System.out.println();
						}
						break;
				}
			} else {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
				System.out.println();
			}
			cnt++;
		}
		sc.close();
	}
}
