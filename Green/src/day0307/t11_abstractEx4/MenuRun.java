package day0307.t11_abstractEx4;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Child child = new Child();
		LunchMenu lunchMenu = new Child();
		
		String name  = " ";
		while(true) {
			System.out.print("아이를 선택하세요? (1.철수, 2.영희) => ");
			name = scanner.next();
			if(name.equals("철수") || name.equals("1")) {
				lunchMenu.childName = "철수";
			}
			else if(name.equals("영희") || name.equals("2")) {
				lunchMenu.childName = "영희";
			}
			else {
				continue;
			}
			break;
		}
		int choice;
		int cnt = 0;
		while(true) {
			lunchMenu.menuPrint();
			System.out.print("선택 : ");
			choice = scanner.nextInt();
			if(choice < 0 || choice > 6) {
				System.out.println("메뉴를 다시 선택하세요.");
				continue;
			}else if(choice == 0) {
				break;
			}
			else {
				//추가 메뉴선택을 배열에 저장.
				lunchMenu.order[cnt] = choice + 1;		//두부조림 1번을 선택하면 menuPrice의 2번 두부조림을 가리켜야해서..
				cnt++;
			}
		}
		lunchMenu.menuCnt = cnt;
		lunchMenu.lunchRun();
		System.out.println("----------------------------------");
		
		scanner.close();
	}
}
