package day0307.t13_abstractEx5;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Child child = new Child();
		boolean flag = true;
		int choice;
		
		while(flag) {
			System.out.println("==========================================");
			System.out.println("1.아이등록 2.간식선택 3.식대계산 0.종료");
			System.out.println("------------------------------------------");
			System.out.print("> ");
			choice = scanner.nextInt();
			
			switch(choice) {
				case 1:		//아이등록
					if(child.name != null) {
						System.out.println("이미 아이가 등록되어있습니다. 간식을 선택하세요.");
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
