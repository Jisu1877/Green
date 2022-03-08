package day0307.t13_abstractEx5;

import java.util.Scanner;

public class Child extends Menu {
	Scanner scanner = new Scanner(System.in);
	String name;
	int cnt = 0;
	
	@Override
	public void childInput() {
		System.out.println("아이의 이름을 입력하세요?");
		name = scanner.next();
	}

	@Override
	public void dessertChoice() {
		int gubun;
		while(true) {
			System.out.print(name + " 아이가 먹을 간식을 선택하세요?(종료:0) ");
			System.out.println("기본메뉴(2500원): 밥/불고기");
			System.out.println("간식선택: 1.두부조림(1000원), 2.미역국(1000원), 3.요플레(800원) 4.바나나(500원) 5.우유(500원) 6.아몬드(700원), 0.종료");
			gubun = scanner.nextInt();
			if(gubun == 0) break;
			if(gubun < 0 || gubun > 6) continue;
			order[cnt] = gubun + 1;
			price += dessertPrice[gubun + 1];
			cnt++;
		}
	}

	@Override
	public void desserPrint() {
		System.out.println("==========================================");
		System.out.println("* 기본제공메뉴 : 밥 / 불고기");
		System.out.print("선택한 간식 : ");
		for(int i=0; i<cnt; i++) {
			System.out.print(dessert[order[i]] + " ");
		}
		if(cnt == 0) {
			System.out.println("선택된 간식이 없습니다.");
		}
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println(name + "의 식대는? " + price);
		System.out.println("==========================================");
	}

}
