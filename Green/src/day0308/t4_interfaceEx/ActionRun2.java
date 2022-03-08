package day0308.t4_interfaceEx;

import java.util.Scanner;

public class ActionRun2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Action[] action = {new PoliceMan(), new FireMan(), new Chef()};
		String[] title = {"경찰관", "소방관", "요리사"};
		int choice;
		
		//배우가 맡게될 역할을 선택하여 출력하시오...
		while(true) {
			System.out.println("\n역할을 선택하세요? ");
			System.out.println("1.경찰관 | 2.소방관 | 3.요리사 | 0.종료");
			System.out.print("선택 > ");
			choice = scanner.nextInt();
			if(choice < 0 || choice > 3) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.\n");
				continue;
			}else if(choice == 0) {
				break;
			}
			switch(choice) {
				case 1:
					System.out.println("선택하신 역할은 : " + title[choice-1] + "입니다.");
					System.out.println(title[choice-1] + "은, ");
					action[choice-1].catching();
					action[choice-1].search();
					break;
				case 2:
					System.out.println("선택하신 역할은 : " + title[choice-1] + "입니다.");
					System.out.println(title[choice-1] + "은, ");
					action[choice-1].fire();
					action[choice-1].rescue();;
					break;
				case 3:
					System.out.println("선택하신 역할은 : " + title[choice-1] + "입니다.");
					System.out.println(title[choice-1] + "는, ");
					action[choice-1].cooking();
					action[choice-1].spagetti();
					break;
			}
		}
		System.out.println("종료합니다.");
		scanner.close();
	}
}
