package day0307.t12_abstractEx5;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Child child = new Child();
		boolean flag = true;
		boolean flag2 = true;
		
		int choice;
		int yesOrNo;
		
		while(flag) {
			System.out.println("==========================================");
			System.out.println("1.아이등록 2.간식선택 3.식대계산 0.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			choice = scanner.nextInt();
			
			switch(choice) {
				case 1:		//아이등록
					if(child.name != null) {
						while(flag2) {
							System.out.println("\n새로운 아이를 등록하시겠습니까? (1.네 / 2.아니오)");
							System.out.print("선택> ");
							yesOrNo = scanner.nextInt();
							if(yesOrNo == 1) {
								System.out.println("아이등록을 새롭게 진행합니다.");
								child.childInput();
								child.cnt = 0;
								child.reset = false;
								flag2 = false;
							}else if(yesOrNo == 2) {
								flag2 = false;
								continue;
							}else {
								System.out.println("다시입력해주세요.");
								flag2 = true;
							}
						}
					}
					else {
						child.childInput();
					}
					break;
				case 2:		//간식선택 및 계산
					if(child.name == null) {
						System.out.println("아이가 등록되어있지 않습니다. 아이를 먼저 등록하세요.");
						continue;
					}
					else {
						child.dessertChoice();
						break;
					}
				case 3:		//식대출력
					if(child.name == null) {
						System.out.println("아이가 등록되어있지 않습니다. 아이를 먼저 등록하세요.");
						continue;
					}
					else {
						child.desserPrint();
						break;
					}
				default:
					flag = false;
			}	// switch의 종료
		}	//while의 종료
		System.out.println("\n감사합니다.");
		scanner.close();
	}
}
